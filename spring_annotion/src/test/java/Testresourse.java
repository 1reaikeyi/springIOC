import eResouse.Two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testresourse {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("eResouse");
        Two two = context.getBean("two", Two.class);
        System.out.println(two);
        two.save();
    }
}
