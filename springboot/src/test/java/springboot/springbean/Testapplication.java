package springboot.springbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Testapplication {
    @Autowired
    private SomeEnviroment someEnviroment;
    @Test
    void test_1() {
        someEnviroment.deSome();
    }

}
