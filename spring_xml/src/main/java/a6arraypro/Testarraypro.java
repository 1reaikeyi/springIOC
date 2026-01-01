package a6arraypro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testarraypro {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("6arraypro.xml");
        Arraypro list = context.getBean("listBean1", Arraypro.class);
        list.print1();
        System.out.println("==========================");
        Arraypro list2 = context.getBean("listBean2", Arraypro.class);
        list2.print2();
        System.out.println("==========================");
        Arraypro list3 = context.getBean("listBean3", Arraypro.class);
        list3.print3();
        System.out.println("==========================");
    }
}
