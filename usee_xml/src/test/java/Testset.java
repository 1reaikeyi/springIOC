import a2set.Two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testset {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("2set.xml");
        Two two = context.getBean("twoBean", Two.class);
        two.two();
    }
}
