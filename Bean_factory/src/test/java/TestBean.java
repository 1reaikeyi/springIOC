import bfactory.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bbean.xml");
        A bean1 = (A) context.getBean("bean1");
        A bean2 = (A) context.getBean("bean2");
        A bean3 = (A) context.getBean("bean3");
        A bean4 = (A) context.getBean("bean4");
        A bean44 = (A) context.getBean("bean4");

    }
}
