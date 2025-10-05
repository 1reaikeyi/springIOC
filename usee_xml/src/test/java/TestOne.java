import a9one.One;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOne {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("9one.xml");
        One one = (One) context.getBean("onebean");
        one.print();
        System.out.println("=========================");
        One two = (One) context.getBean("onebean");
        two.print();
        System.out.println("=========================");
        One three = (One) context.getBean("onebean");
        three.print();
    }
}
