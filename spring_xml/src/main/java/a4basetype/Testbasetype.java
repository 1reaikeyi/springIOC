package a4basetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbasetype {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("4basetype.xml");
        Basetype basetype = (Basetype) context.getBean("basetypebean");
        basetype.show();
        Server server = (Server) context.getBean("serverbean");
        server.show();

    }
}
