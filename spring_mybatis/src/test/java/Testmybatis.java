import bmybatis.Account;
import bmybatis.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Testmybatis {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("mybatis/mybatisbean.xml");
        Server service = ac.getBean("server", Server.class);
        service.withdraw("张三", "李四", 100);
        List<Account> accounts = service.selectAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
