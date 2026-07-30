package bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Outer {
    //假设out类是一个第三方类，我们无法修改它
    @Bean
    @ConfigurationProperties(prefix = "outer")
    public Out getOut() {
        return new Out();
    }


}
