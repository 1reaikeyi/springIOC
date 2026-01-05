package springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.controller.PrefileUser;
import springboot.controller.ValueUser;
//绑定3
@EnableConfigurationProperties(PrefileUser.class)
@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private ValueUser valueUser;

    @Test
    void contextLoads() {
        valueUser.introduce();
    }
    @Autowired
    private PrefileUser prefileUser;
    @Test
    void contextLoads1() {
        prefileUser.introduce();
    }



}
