import life.Life;
import life.Lifecycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife{
    @Test
    public void main_1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        Life life = context.getBean("life1", Life.class);
        System.out.println("第四部" + life);
        System.out.println("赋值" + life.getId());
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext)context;
        context1.close();
    }

    @Test
    public void main_2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        Lifecycle lifecycle = context.getBean("life2", life.Lifecycle.class);
        System.out.println("第四部" + lifecycle);
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext)context;
        context1.close();
    }

    @Test
    public void main_3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        Lifecycle lifecycle = context.getBean("life3", life.Lifecycle.class);
        System.out.println("第四部" + lifecycle);
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext)context;
        context1.close();
    }
}
