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
/**
 public static void main(String[] args) throws UnknownHostException {
 SpringApplication app = new SpringApplicationBuilder(AIGCApplication.class).build(args);
 Environment env = app.run(args).getEnvironment();
 String protocol = "http";
 if (env.getProperty("server.ssl.key-store") != null) {
 protocol = "https";
 }
 log.info("--/\n---------------------------------------------------------------------------------------\n\t" +
 "Application '{}' is running! Access URLs:\n\t" +
 "Local: \t\t{}://localhost:{}\n\t" +
 "External: \t{}://{}:{}\n\t" +
 "Profile(s): \t{}" +
 "\n---------------------------------------------------------------------------------------",
 env.getProperty("spring.application.name"),
 protocol,
 env.getProperty("server.port"),
 protocol,
 InetAddress.getLocalHost().getHostAddress(),
 env.getProperty("server.port"),
 env.getActiveProfiles());
 }

 */
