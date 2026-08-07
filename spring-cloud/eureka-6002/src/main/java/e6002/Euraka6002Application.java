package e6002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Eureka 服务消费者启动类
 *
 * @LoadBalancerClient(name = "eureka-client2", configuration = LoadBalancerConfig.class):
 *   仅对 eureka-client2 这个服务使用自定义的随机负载均衡策略,
 *   其他服务(如 eureka-service、eureka-client3/4)默认使用轮询策略。
 */
@SpringBootApplication
@EnableDiscoveryClient
@LoadBalancerClient(name = "eureka-client2", configuration = LoadBalancerConfig.class)
public class Euraka6002Application {

    public static void main(String[] args) {
        SpringApplication.run(Euraka6002Application.class, args);
    }

    // 注册一个带负载均衡能力的 RestTemplate,通过服务名调用其他服务
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
