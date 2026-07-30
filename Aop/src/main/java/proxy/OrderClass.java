package proxy;

public class OrderClass {
    public boolean save(){
        long start = System.currentTimeMillis();
        System.out.println("保存ing-------------");
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
        return true;
    }
    public void select(){
        long start = System.currentTimeMillis();
        System.out.println("查询ing-------------");
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

}
