package springboot.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.springbean.Properties;
import springboot.springbean.pro.Apro;
import springboot.springbean.pro.Collection;
import springboot.springbean.pro.Out;

@EnableConfigurationProperties({Collection.class, Apro.class, Properties.class})

@SpringBootTest
class TestBean {

    @Autowired
    private Collection collection;
    @Test
    public void test_1() {
        collection.show();
    }

    @Autowired
    private Apro apro;
    @Test
    public void test_2() {
        apro.show();
    }

    @Autowired
    private Out c;
    @Test
    public void test_3() {
        System.out.println(c.getName());
        System.out.println(c.getAge());
    }


}
