package afacrory;

import fnewto.Stu;
import jdk.jfr.Enabled;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class NewtoSpring {
    public static void main(String[] args) {
        Stu stu = new Stu();
        System.out.println(stu);
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerSingleton("stu",stu);
        Object bean = beanFactory.getBean("stu");
        System.out.println(bean);


    }
}
