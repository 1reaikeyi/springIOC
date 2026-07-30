package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(Application.class, args);
        String[] beanNames = application.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            if(beanName.equals("a")){
                System.out.println("注册成功"+beanName);
            }

            if(beanName.equals("b")){
                System.out.println("注册成功"+beanName);
            }
        }

        application.close();

    }

}
