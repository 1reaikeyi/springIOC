import config.ApplicationContext;
import config.ClassPathXmlAppplicationContext;
import org.junit.Test;
import pojo.User;
import pojo.UserServer;

public class RebuildTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlAppplicationContext("src/main/resources/config.xml");
        User user = (User) context.getBean("userBean");
        System.out.println(user);
        UserServer service = (UserServer) context.getBean("service");
        service.insert();
    }
}
