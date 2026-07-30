package 线程;

import java.util.concurrent.ExecutionException;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t = new Thread1();
        t.start();
        Thread t1 = new Thread1();
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main输出：" + i);
        }
        System.out.println("main结束");
    }

//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Runnable runnable = new Thread2();
//        Thread t = new Thread(runnable);
//        t.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main输出："+i);
//        }

//        ===============================
//        Callable<String> call = new Thread3();
//        FutureTask<String> futureTask = new FutureTask(call);
//        Thread t = new Thread(futureTask);
//        t.start();
//        String s = futureTask.get();
//        System.out.println("s = " + s);
//    }

}

