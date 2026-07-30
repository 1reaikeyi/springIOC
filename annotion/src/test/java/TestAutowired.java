import dautowired.One;
import dautowired.Two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dautowired.xml");
        One one = (One) context.getBean("one");
        one.save();
        Two two = (Two) context.getBean("two");
        two.save();
    }
}
