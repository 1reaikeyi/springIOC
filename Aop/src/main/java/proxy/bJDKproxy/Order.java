package proxy.bJDKproxy;

public class Order implements Person {
    @Override
    public void save(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("保存订单------");

    }

    @Override
    public void del() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("删除订单------");
    }

    @Override
    public void select() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("查询订单------");
    }
}
