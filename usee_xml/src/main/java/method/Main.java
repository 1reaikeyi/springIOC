package method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //classpath: 类路径下
        //                         =  <------先创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //文件系统路径下
//        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");
        //获取对象
        Object bean = context.getBean("methodBean");
        //获取对象的类型----转换类型
        Method a = context.getBean("methodBean",Method.class);
        a.say();
        System.out.println("method = " + a);

        System.out.println("--------------------");
        Object time= context.getBean("nowTime",Date.class);
        System.out.println("time = " + time);

    }
}