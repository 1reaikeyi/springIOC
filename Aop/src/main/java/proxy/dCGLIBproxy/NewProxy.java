package proxy.dCGLIBproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class NewProxy {
    public static Object setCallback(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("执行方法: " + method.getName());
            long start = System.currentTimeMillis();
            // 调用目标方法
            Object result = methodProxy.invokeSuper(o, objects);
            long end = System.currentTimeMillis();
                System.out.println("耗时：" + (end - start) + "ms");
                return result;
        }
    });
        return enhancer.create();
    }
}
