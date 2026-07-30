import cValue.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tsetvalue {
    public static void main(String[] args) {
        ApplicationContext annotatoinContext = new AnnotationConfigApplicationContext("cValue");
        Stu stu = annotatoinContext.getBean("stu",Stu.class);
        System.out.println(stu);
        System.out.println("stu.getName() = " + stu.getName());
        System.out.println("stu.getID() = " + stu.getId());
    }
}
