package csecurity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = {"csecurity"})
@Component("server")
public class Serverr {
    public void save(){
        System.out.println("server正在保存---------------");
    }
    public void update(){
        System.out.println("server正在更新---------------");
    }

}
