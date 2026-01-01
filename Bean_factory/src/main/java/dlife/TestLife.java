package dlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dlife.xml");
        Lifecycle lifecycle = context.getBean("bean1", Lifecycle.class);
        System.out.println("第四部" + lifecycle);
        System.out.println("lifecycle-id: = " + lifecycle.getId());
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext)context;
        context1.close();
    }
}
