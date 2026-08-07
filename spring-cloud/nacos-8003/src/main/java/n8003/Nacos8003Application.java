package n8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"clients"})
@ComponentScan(basePackages = {"clients","service", "n8003"})
public class Nacos8003Application {

    public static void main(String[] args) {
        SpringApplication.run(Nacos8003Application.class, args);
    }

}
