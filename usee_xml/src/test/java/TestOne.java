import a9one.One;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOne {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("9one.xml");
        One one = (One) context.getBean("onebean");
        one.print();
        System.out.println("one=========================");
        One two = (One) context.getBean("onebean");
        two.print();
        System.out.println("two=========================");
        One three = (One) context.getBean("onebean");
        three.print();
        System.out.println("three=========================");
        // 使用匿名内部类创建并启动第一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                One one = (One) context.getBean("onebean");
                one.print();
                System.out.println("one=========================");
                One two = (One) context.getBean("onebean");
                two.print();
                System.out.println("two=========================");
                One three = (One) context.getBean("onebean");
                three.print();
                System.out.println("three=========================");
                System.out.println("-----++++++++++++++++");
            }
        }).start(); // 调用start()方法启动线程

        // 使用匿名内部类创建并启动第二个线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                One two = (One) context.getBean("onebean");
//                two.print();
//            }
//        }).start(); // 调用start()方法启动线程
    }
}
