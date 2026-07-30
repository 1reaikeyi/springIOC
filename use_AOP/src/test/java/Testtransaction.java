import btransaction.Usee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testtransaction {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("btransaction");
        Usee usee = context.getBean("action", Usee.class);
        usee.save();
        usee.update();
    }
}
