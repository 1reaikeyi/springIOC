import transaction.DrawMoney;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Transaction {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        DrawMoney drawMoney = context.getBean("drawMoney", DrawMoney.class);
        drawMoney.draw("张三", "李四", 100);
    }
    @Test
    public void testAnnotion(){
        ApplicationContext context = new AnnotationConfigApplicationContext("transaction");
        DrawMoney drawMoney = context.getBean("drawMoney", DrawMoney.class);
        drawMoney.draw("张三", "李四", 100);
    }
}
