package aproxy;

import bJDKproxy.Person;

public class Ordertime implements Person {
    private Person order;
    public Ordertime() {
    }

    public Ordertime(Person order) {
        this.order = order;
    }
    @Override
    public void save() {
        long start = System.currentTimeMillis();
        try {
            order.save();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("Ordertime save took " + (end - start) + "ms");
    }

    @Override
    public void del() {
        long start = System.currentTimeMillis();
        order.del();
        long end = System.currentTimeMillis();
        System.out.println("Ordertime del took " + (end - start) + "ms");
    }

    @Override
    public void select() {
        long start = System.currentTimeMillis();
        order.select();
        long end = System.currentTimeMillis();
        System.out.println("Ordertime select took " + (end - start) + "ms");
    }
}
