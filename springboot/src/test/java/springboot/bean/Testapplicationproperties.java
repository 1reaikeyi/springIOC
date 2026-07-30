package springboot.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@EnableConfigurationProperties(User.class)
@SpringBootTest
class Testapplicationproperties {
    @Autowired
    private ValueUser valueUser;

    @Test
    void contextLoads() {
        valueUser.introduce();
    }
    @Autowired
    private User user;
    @Test
    void contextLoads_1() {
        user.introduce();
    }



}
