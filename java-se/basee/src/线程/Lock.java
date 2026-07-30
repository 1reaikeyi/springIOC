package 线程;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {

}
class account{
    private int balance;
    private String name;

    public account(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public account() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 使用synchronized关键字确保线程安全的取款方法
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " 开始取款，金额：" + amount);
        try {
            // 模拟取款处理时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " 取款成功，余额：" + balance);
    }
//    // 使用ReentrantLock实现线程安全的取款方法
//    public void withdraw(int ReentrantLock) {
//        // 获取锁
//        java.util.concurrent.locks.Lock lock = new ReentrantLock();
//        lock.lock();
//        try {
//            System.out.println(Thread.currentThread().getName() + " 开始取款，金额：" + ReentrantLock);
//            try {
//                // 模拟取款处理时间
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            balance -= ReentrantLock;
//            System.out.println(Thread.currentThread().getName() + " 取款成功，余额：" + balance);
//        } finally {
//            // 释放锁，放在finally块中确保锁一定会被释放
//            lock.unlock();
//        }
//    }
}


