package 线程;

public class Thread1 extends Thread{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(t.getName()+"\t"+i);
//        }
        System.out.println(t.getName()+"开始");
        System.out.println(t.getName()+"结束");
    }
}
