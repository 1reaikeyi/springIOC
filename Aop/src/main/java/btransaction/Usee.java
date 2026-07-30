package btransaction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = {"btransaction"})
@Component("action")
public class Usee {

    public void save(){
        System.out.println("client正在保存---------------");
    }
    public void update(){
        System.out.println("client正在更新---------------");
    }
}
