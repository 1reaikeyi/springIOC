package springboot.springbean.pro;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import springboot.springbean.User;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties("collection")
public class Collection {
    private String[] names;
    private User[] user;
    private List<String> list;
    private Map<String, String> map;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public User[] getUser() {
        return user;
    }

    public void setUser(User[] user) {
        this.user = user;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void show(){
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(user));
        System.out.println(list.toString());
        System.out.println(map.toString());
    }
}
