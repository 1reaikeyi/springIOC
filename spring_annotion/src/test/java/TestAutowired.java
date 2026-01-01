import dAutowired.One;
import dAutowired.Two;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutowired {
    public static void main(String[] args) {
        ApplicationContext annotation = new AnnotationConfigApplicationContext("dAutowired");
        One one = (One) annotation.getBean("one");
        one.save();
        Two two = (Two) annotation.getBean("two");
        two.save();
    }
}
