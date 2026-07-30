package a1method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //classpath: 类路径下
        ApplicationContext context = new ClassPathXmlApplicationContext("1bean.xml");
        //文件系统路径下
//        ApplicationContext context = new FileSystemXmlApplicationContext("1bean.xml");
        Method a = context.getBean("methodBean",Method.class);
        a.say();
        System.out.println("--------------------");
        Object time= context.getBean("nowTime",Date.class);
        System.out.println("time = " + time);

    }
}