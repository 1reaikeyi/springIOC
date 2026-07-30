import bbean.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bbean.A;
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bbean.xml");
        Bean bean1 = (Bean) context.getBean("bean1");
        System.out.println();
        A bean2 = (A) context.getBean("bean2");
        System.out.println();
        A bean3 = (A) context.getBean("bean3");
        System.out.println();
        A bean4 = (A) context.getBean("bean4");
        A bean5 = (A) context.getBean("bean4");

    }
}
