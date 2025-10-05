import a5array.array;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testarray {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("5array.xml");
        array array = context.getBean("arrayBean1", array.class);
        array.print();
        array array2 = context.getBean("arrayBean2", array.class);
        array2.print();
        array array3 = context.getBean("arrayBean3", array.class);
        array3.print();
    }
}
