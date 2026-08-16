package bean.文件;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:bean.properties")
@Component
public class PropertiesBean {
    @Value("${value.name}")
    private String username;
    @Value("${value.id}")
    private int id;
    public PropertiesBean() {

    }
    public PropertiesBean(String username, int id) {
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
