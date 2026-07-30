import a3constructor.Two;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testconstructor {
    @Test
    public void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("3constructor.xml");
        Two two = context.getBean("twobean", Two.class);
        two.show();
    }
    @Test
    public void main2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("3constructor.xml");
        Two two = context.getBean("two", Two.class);
        two.show();
    }
}
