package springboot.springbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@EnableConfigurationProperties({Collection.class, Apro.class})
@SpringBootTest(classes = springboot.Application.class)
class TestBean {
    @Autowired
    @Qualifier("xml")
    private XmlBean bean;
    @Test
    public void test_1() {
        System.out.println(bean.getName());
    }

    @Autowired
    private Collection collection;
    @Test
    public void test_2() {
        collection.show();
    }

    @Autowired
    private Apro apro;
    @Test
    public void test_3() {
        apro.show();
    }

    @Autowired
    private Out c;
    @Test
    public void test_4() {
        System.out.println(c.getName());
        System.out.println(c.getAge());
    }

   @Autowired
   private ValueUser valueUser;
   @Test
   public void test_5() {
       valueUser.introduce();
   }


}
