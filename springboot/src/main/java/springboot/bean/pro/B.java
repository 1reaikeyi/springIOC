package springboot.bean.pro;

import org.springframework.stereotype.Component;

@Component
public class B {
    private String className;
    private String location;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
