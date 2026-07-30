import eAop.Serverr;
import eAop.Usee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testaop {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("eapo.xml");
//        Usee usee1 = ac.getBean("usee",Usee.class);
//        usee1.save();
        ApplicationContext ac = new AnnotationConfigApplicationContext("eAop");
        Usee usee1 = ac.getBean("usee",Usee.class);
        usee1.save();

    }
}
