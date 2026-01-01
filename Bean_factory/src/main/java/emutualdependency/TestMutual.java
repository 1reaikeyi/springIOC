package emutualdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMutual {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("emutualdependency.xml");
        One one = (One) context.getBean("onebean");
        System.out.println(one);
        Two two = (Two) context.getBean("twobean");
        System.out.println(two);

    }
}
