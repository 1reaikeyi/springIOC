package springboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//绑定1
//@Component
//绑定2
//@Configuration
//关联到application.properties
@ConfigurationProperties(prefix = "prefile")
public class PrefileUser {
    private int id;
    private String name;

    public PrefileUser() {
    }

    public PrefileUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void introduce() {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }
}
