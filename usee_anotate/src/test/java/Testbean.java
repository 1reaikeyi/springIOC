
import bbean.Component;
import bbean.Stu1;
import bbean.Stu2;
import bbean.Stu3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bbean.xml");
        Component bean = context.getBean("one", Component.class);
        System.out.println(bean);
        Stu1 stu1 = context.getBean("stu1", Stu1.class);
        System.out.println(stu1);
        Stu2 stu2 = context.getBean("two", Stu2.class);
        System.out.println(stu2);
        Stu3 stu3 = context.getBean("stu3", Stu3.class);
        System.out.println(stu3);

    }
}
