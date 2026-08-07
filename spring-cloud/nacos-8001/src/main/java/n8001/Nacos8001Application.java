package n8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Nacos8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Nacos8001Application.class, args);
    }

}
