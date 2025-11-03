import bmybatis.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmybatis {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("mybatisbean.xml");
        Server service = ac.getBean("server", Server.class);
        service.withdraw("张三", "李四", 100);
    }
}
