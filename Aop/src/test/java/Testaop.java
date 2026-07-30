import aaop.Usee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testaop {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext("aaop");
        Usee usee1 = ac.getBean("usee",Usee.class);
        usee1.save();
        usee1.exit();

    }
}
