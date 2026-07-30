import factory.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
        A bean1 = (A) context.getBean("bean");

        A bean2 = (A) context.getBean("beanstatic");

        A bean3 = (A) context.getBean("beandynamic");

        A bean4 = (A) context.getBean("factoryA");
        A bean44 = (A) context.getBean("factoryA");

    }
}
