import bean.Server;
import bean.User;
import config.ApplicationContext;
import config.ClassPathXmlAppplicationContext;
import org.junit.Test;

public class TestBuild {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlAppplicationContext("src/main/resources/config.xml");
        User user = (User) context.getBean("userBean");
        System.out.println(user);
        Server service = (Server) context.getBean("service");
        service.insert();
    }
}
