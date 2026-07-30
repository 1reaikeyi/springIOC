package springboot.springbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


//指定配置文件的路径
@PropertySource("classpath:/propertiessource.properties")
@Configuration
@ConfigurationProperties(prefix = "source")
public class Properties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
