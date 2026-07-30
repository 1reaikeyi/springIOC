import proxy.JDKProxy;
import proxy.OrderInterface;

public class TestJdk {
    public static void main(String[] args) throws Exception {
        // 创建代理对象
       OrderInterface proxy = (OrderInterface) JDKProxy.newProxyInstance(new Order());
        // 调用代理对象的方法
        proxy.save();
        proxy.del();
        proxy.select();
    }

}
class Order implements OrderInterface {
    @Override
    public void save() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("保存ing-------------");
    }

    @Override
    public void del() {
        System.out.println("删除ing-------------");
    }

    @Override
    public void select() {
        System.out.println("查询ing-------------");

    }
}
