import a6list.list;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlist {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("6list.xml");
        list list = context.getBean("listBean", list.class);
        list.print();
        System.out.println("==========================");
        list list2 = context.getBean("listBean2", list.class);
        list2.print2();
        System.out.println("==========================");
        list list3 = context.getBean("listBean3", list.class);
        list3.print3();
        System.out.println("==========================");
        list list4 = context.getBean("listBean4", list.class);
        list4.print4();
    }
}
