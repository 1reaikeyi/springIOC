import a2set.Two;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
