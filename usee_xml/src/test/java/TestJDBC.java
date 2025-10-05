import a8properties.JDBC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("8properties.xml");
        JDBC jdbc = (JDBC) context.getBean("jdbc");
        System.out.println("jdbc = " + jdbc);
    }
}
