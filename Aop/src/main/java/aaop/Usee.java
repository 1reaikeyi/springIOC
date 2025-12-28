package aaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages ={"aaop"})
@Component
public class Usee {
    public void save(){
        System.out.println("正在保存---------------");
    }
    public void exit(){
        System.out.println("正在退出---------------");
    }
}
