import date.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDate {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("date.xml");
        Stu stu = context.getBean("stu1", Stu.class);
        System.out.println(stu.getBir());

        Stu stu1 = context.getBean("stu2", Stu.class);
        System.out.println(stu1.getBir());
    }
}
