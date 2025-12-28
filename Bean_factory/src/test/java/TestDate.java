import cDate.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
//       Date now = new Date();
//        System.out.println(now);
        ApplicationContext context = new ClassPathXmlApplicationContext("cDate.xml");
        Stu stu = context.getBean("stu1", Stu.class);
        System.out.println(stu.getBir());
        Stu stu1 = context.getBean("stu2", Stu.class);
        System.out.println(stu1.getBir());
    }
}
