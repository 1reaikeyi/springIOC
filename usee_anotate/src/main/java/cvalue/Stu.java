package cvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Stu {
    //先调用无参构造器，再调用set方法，最后调用有参构造器
//    使用@Value注解给属性赋值，可以不用set方法，但是要在属性上添加@Value注解
    @Value("张三")
    private String name;
    @Value("001")
    private int id;

    public String getName() {
        return name;
    }
    @Value("李四")
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    @Value("002")
    public void setId(int id) {
        this.id = id;
    }

    public Stu() {
        System.out.println("无参构造器");
    }
    public Stu(@Value("王五") String name,@Value("123") int id) {
        System.out.println("有参构造器");
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
