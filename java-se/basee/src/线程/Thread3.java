package 线程;

import java.util.concurrent.Callable;

public class Thread3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread t = Thread.currentThread();
        int i = 0, sum = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(t.getName()+"\t"+i);
            sum += i;
        }
        return sum+"";
    }
}
