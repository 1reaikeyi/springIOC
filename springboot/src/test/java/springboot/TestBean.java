package springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.bean.Collection;

@EnableConfigurationProperties(Collection.class)
@SpringBootTest
public class TestBean {

    @Autowired
    private Collection collection;
    @Test
    public void test_1() {
        collection.show();
    }
}
