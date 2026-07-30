package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(Application.class, args);
        String[] beanNames = application.getBeanDefinitionNames();
        int count = 0;
        for (String beanName : beanNames) {
            System.out.println(beanName);
            count++;
        }
        System.out.println(count);

        application.close();

    }

}
