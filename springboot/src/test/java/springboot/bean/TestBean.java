package springboot.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.bean.pro.A;
import springboot.bean.pro.Collection;

@EnableConfigurationProperties({Collection.class,A.class})

@SpringBootTest
class TestBean {

    @Autowired
    private Collection collection;
    @Test
    public void test_1() {
        collection.show();
    }
    @Autowired
    private A a;
    @Test
    public void test_2() {
        a.show();
    }
}
