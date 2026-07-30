package springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.controller.User;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private User user;

    @Test
    void contextLoads() {
        user.introduce();
    }


}
