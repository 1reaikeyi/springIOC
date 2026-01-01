package a2set;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class Testset {
    @Test
    public void byName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("2set.xml");
        Two two = context.getBean("two", Two.class);
        two.use();
    }
    @Test
    public void testset(){
        ApplicationContext context = new ClassPathXmlApplicationContext("2set.xml");
        Two two = context.getBean("twoBean", Two.class);
        two.use();
    }
}
