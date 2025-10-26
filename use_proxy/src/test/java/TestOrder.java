import aproxy.Order;
import aproxy.Ordertime;
import bJDKproxy.Person;

public class TestOrder {
    public static void main(String[] args) {
        // 创建被代理对象
        Person person = new Order();
        // 创建代理对象，并传入被代理对象
        Ordertime ordertime = new Ordertime(person);
        ordertime.del();
        ordertime.save();
        ordertime.select();
    }
}
