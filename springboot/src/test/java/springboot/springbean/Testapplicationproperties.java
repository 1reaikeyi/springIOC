package springboot.springbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.springbean.Properties;
import springboot.springbean.User;
import springboot.springbean.ValueUser;
import springboot.springbean.XmlBean;

@EnableConfigurationProperties({User.class, Properties.class})
@SpringBootTest
class Testapplicationproperties {
    @Autowired
    private ValueUser valueUser;

    @Test
    void test_1() {
        valueUser.introduce();
    }

    @Autowired
    private User user;

    @Test
    void test_2() {
        user.introduce();
    }

    @Autowired
    private Properties properties;
    @Test
    public void test_4() {
        System.out.println(properties.getName());
        System.out.println(properties.getAge());
    }

    @Autowired
    @Qualifier("xml")
    private XmlBean bean;
    @Test
    public void test_5() {
        System.out.println(bean.getName());
    }


}
