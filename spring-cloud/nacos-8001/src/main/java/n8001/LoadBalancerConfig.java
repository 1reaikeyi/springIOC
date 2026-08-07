package n8001;

import org.springframework.context.annotation.Configuration;

/**
 * 局部负载均衡配置示例：
 */
@Configuration
public class LoadBalancerConfig {
//    @Bean
//    ReactorLoadBalancer<ServiceInstance> loadBalancer(Environment env, LoadBalancerClientFactory factory) {
//        String name = env.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//        System.out.println("----------------------------------------------name = " + name);
//        return new RandomLoadBalancer(
//            factory.getLazyProvider(name, ServiceInstanceListSupplier.class), name);
//    }
}
