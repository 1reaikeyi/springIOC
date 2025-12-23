package proxy.cCGLIB;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.matcher.ElementMatchers;


import java.lang.reflect.Method;

public class NewProxy {
    public static Object setCallback(Object target){
        try {
            return new ByteBuddy()
                    .subclass(target.getClass())
                    .method(ElementMatchers.any())
                    .intercept(MethodDelegation.to(new Interceptor(target)))
                    .make()
                    .load(NewProxy.class.getClassLoader())
                    .getLoaded()
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static class Interceptor {
        private final Object target;

        public Interceptor(Object target) {
            this.target = target;
        }

        @RuntimeType
        public Object intercept(@Origin Method method, @AllArguments Object[] args) throws Throwable {
            System.out.println("执行方法: " + method.getName());
            long start = System.currentTimeMillis();
            Object result = method.invoke(target, args);
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - start) + "ms");
            return result;
        }
    }
}