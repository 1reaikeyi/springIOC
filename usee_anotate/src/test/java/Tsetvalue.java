import cvalue.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tsetvalue {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cvalue.xml");
        Stu stu = (Stu) context.getBean("stu");
        System.out.println(stu);
        System.out.println("stu.getName() = " + stu.getName());
        System.out.println("stu.getID() = " + stu.getId());
    }
}
