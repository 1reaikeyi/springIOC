package proxy;


public class Testcglibproxy {
    public static void main(String[] args) {
        OrderClass proxy = (OrderClass) new CGLIBProxy().setCallback(new OrderClass());
        boolean result = proxy.save();
        System.out.println(result);
        proxy.select();
    }

}

