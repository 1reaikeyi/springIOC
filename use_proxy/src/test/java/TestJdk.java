import bJDKproxy.NewProxy;
import bJDKproxy.Order;
import bJDKproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJdk {
    public static void main(String[] args) throws Exception {
        // 创建被代理对象
        Order target = new Order();
        // 创建代理对象
       Person proxy = (Person) NewProxy.newProxyInstance(target);
        proxy.save();
        proxy.del();
        proxy.select();

    }
}
