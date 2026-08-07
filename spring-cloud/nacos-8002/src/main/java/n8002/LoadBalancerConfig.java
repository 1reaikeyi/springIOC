package n8002;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * 局部负载均衡配置示例：
 */
@Configuration
// 关键:通过 name 指定服务名,只对该服务的调用生效
@LoadBalancerClient(name = "nacos-8001", configuration = LoadBalancerConfig.class)
public class LoadBalancerConfig {

    @Bean
    ReactorLoadBalancer<ServiceInstance> loadBalancer(Environment env,
                                                      LoadBalancerClientFactory factory) {
        // 从环境变量获取当前要负载均衡的服务名
        String name = env.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        System.out.println("---------- 当前负载均衡的服务名 = " + name);
        // 返回随机负载均衡器(覆盖默认的 NacosLoadBalancer)
        return new RandomLoadBalancer(
            factory.getLazyProvider(name, ServiceInstanceListSupplier.class), name);
    }
}
