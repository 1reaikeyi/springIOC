import a3constructor.Two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testconstructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("3constructor.xml");
        Two two = context.getBean("twobean", Two.class);
        two.two();
    }
}
