package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {
    public static Object newProxyInstance(Object target){
        return  Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("---------->\t"+method.getName());
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(target, args);
                        long end = System.currentTimeMillis();
                        System.out.println("耗时：" + (end - start));
                        return result;
                    }

                }
        );
    }
}
