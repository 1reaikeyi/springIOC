import eResource.Two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testresource {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("eResource");
        Two two = context.getBean(Two.class);
        System.out.println(two);
        two.save();
    }
}
