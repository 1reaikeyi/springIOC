package aaop;

import org.springframework.stereotype.Component;

@Component("serverr")
public class Serverr {
    public void save(){
        System.out.println("client正在保存---------------");
    }
}
