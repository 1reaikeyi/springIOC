package a7spring_p_c_util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestP_C {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("7spring_p_c_util.xml");
        Usee usee = (Usee) context.getBean("usee1");
        System.out.println(usee);
        Usee usee2 = (Usee) context.getBean("usee2");
        System.out.println(usee2);
        Server server1 = context.getBean("server1", Server.class);
        System.out.println(server1);
        server1.printAll();
        Server server2 = context.getBean("server2", Server.class);
        System.out.println(server2);
        server2.printAll();
    }
}
