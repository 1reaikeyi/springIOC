package proxy;

import dCGLIBproxy.NewProxy;
import dCGLIBproxy.Order;

public class Testcglibproxy {
    public static void main(String[] args) {
        Order order = new Order();
        Order proxy = (Order) new NewProxy().setCallback(order);
        boolean result = proxy.save();
        System.out.println(result);
        proxy.select();
    }
}
