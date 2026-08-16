package bean;

import bean.内联.Apro;
import bean.外联.Out;
import bean.文件.PropertiesBean;
import bean.文件.XmlBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@EnableConfigurationProperties({ACollection.class, Apro.class})
@SpringBootTest(classes = bean.Application.class)
class TestBean {
    @Autowired
    @Qualifier("xml")
    private XmlBean xmlBean;
    @Test
    public void test1() {
        System.out.println(xmlBean.getName());
    }
    @Autowired
    private PropertiesBean propertiesBean;
    @Test
    public void test5() {
        propertiesBean.introduce();
    }

    @Autowired
    private ACollection ACollection;
    @Test
    public void test2() {
        ACollection.show();
    }

    @Autowired
    private Apro apro;
    @Test
    public void test3() {
        apro.show();
    }

    @Autowired
    private Out c;
    @Test
    public void test4() {
        System.out.println(c.getName());
        System.out.println(c.getAge());
    }
    @Autowired
    private DiffenentEnvironment diffenentEnvironment;
    @Test
    void test6() {
        diffenentEnvironment.deSome();
    }



}
