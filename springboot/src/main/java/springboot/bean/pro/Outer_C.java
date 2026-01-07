package springboot.bean.pro;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Outer_C {
    //假设C类是一个第三方类，我们无法修改它
    @Bean
    @ConfigurationProperties(prefix = "outer")
    public C getC() {
        return new C();
    }


}
