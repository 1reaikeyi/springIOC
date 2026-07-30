package 线程;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName()+"\t"+i);
        }
    }
}
