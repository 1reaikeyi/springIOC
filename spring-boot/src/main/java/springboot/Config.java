package springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("a")
    public Config getA() {
        return new Config();
    }
    @Bean("b")
    public Config getB() {
        return new Config();
    }
}
