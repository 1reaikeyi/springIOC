import csecurity.Serverr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSecurity {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("csecurity");
        Serverr serverr = context.getBean("server", Serverr.class);
        serverr.save();
        serverr.update();
    }
}
