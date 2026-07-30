package 线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class 线程池 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3,
                3, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 1; i <= 6; i++) {
            executor.execute(new TestTask(i));
        }
        executor.shutdown();
    }
}
class TestTask extends Thread{
    int taskId;
    public TestTask() {

    }

    public TestTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            // 打印任务执行信息，便于观察线程池调度情况
            System.out.println("任务" + taskId + "开始执行，执行线程：" + Thread.currentThread().getName());
            // 模拟任务耗时（1秒）
            Thread.sleep(1000);
            System.out.println("任务" + taskId + "执行完成");
        } catch (InterruptedException e) {
            // 优雅处理线程中断，恢复中断状态
            Thread.currentThread().interrupt();
            System.err.println("任务" + taskId + "被中断，执行终止：" + e.getMessage());
        }
    }
}
