package springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueUser {
    @Value("${name}")
    private String username;
    @Value("${id}")
    private int id;
    public ValueUser() {

    }
    public ValueUser(String username, int id) {
        this.username = username;
        this.id = id;
        System.out.println("使用有参构造");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void introduce() {
        System.out.println("我是" + username + ", 学号是" + id);
    }
}
