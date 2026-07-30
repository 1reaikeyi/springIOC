package springboot.springbean;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//如果是spring.xml
@ImportResource("classpath:spring.xml")
@Component
public class XmlBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
