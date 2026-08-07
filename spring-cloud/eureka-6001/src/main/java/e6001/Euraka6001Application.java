package e6001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Euraka6001Application {

    public static void main(String[] args) {
        SpringApplication.run(Euraka6001Application.class, args);
    }

}
