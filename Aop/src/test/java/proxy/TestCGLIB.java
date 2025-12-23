package proxy;

import cCGLIB.NewProxy;
//import bJDKproxy.NewProxy;
import cCGLIB.Order;

public class TestCGLIB {
    public static void main(String[] args) {
        // 创建Enhancer对象,类似于JDK动态代理的Proxy类
        Order order = new Order();
        Order proxy = (Order) NewProxy.setCallback(order);
//        Order proxy = (Order) NewProxy.newProxyInstance(order);
        proxy.save();
        proxy.select();
    }
}
