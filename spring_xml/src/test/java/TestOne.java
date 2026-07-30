import a9Single.One;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOne {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("9one.xml");

        One one = (One) context.getBean("onebean");
        System.out.println("one=========================");
        One two = (One) context.getBean("onebean");
        System.out.println("two=========================");
        One three = (One) context.getBean("onebean");
        System.out.println("three=========================");
//        Thread CurrentThread = Thread.currentThread();
//        System.out.println("CurrentThread.getName() = " + CurrentThread.getName());
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Thread CurrentThread = Thread.currentThread();
//                System.out.println("CurrentThread.getName() = " + CurrentThread.getName());
//                One one = (One) context.getBean("onebean");
//                System.out.println("one=========================");
//                One two = (One) context.getBean("onebean");
//                System.out.println("two=========================");
//                One three = (One) context.getBean("onebean");
//                System.out.println("three=========================");
//            }
//        }).start();
//// 调用start()方法启动线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Thread CurrentThread = Thread.currentThread();
//                System.out.println("CurrentThread.getName() = " + CurrentThread.getName());
//                One one = (One) context.getBean("onebean");
//                System.out.println("one=========================");
//                One two = (One) context.getBean("onebean");
//                System.out.println("two=========================");
//                One three = (One) context.getBean("onebean");
//                System.out.println("three=========================");
//            }
//        }).start();

    }
}
