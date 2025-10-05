import a4basetype.Basetype;
import a4basetype.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbasetype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("4basetype.xml");
        Server server = (Server) context.getBean("serverbean");
        server.add();
        System.out.println("-------------------");
        Basetype basetype = (Basetype) context.getBean("basetypebean");
        basetype.add();
    }
}
