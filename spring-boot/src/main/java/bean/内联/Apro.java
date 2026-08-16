package bean.内联;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("address")
@Configuration
public class Apro {
    private String Building;
    private A A;


    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public A getRoom() {
        return A;
    }

    public void setRoom(A a) {
        this.A = a;
    }
    public void show() {
        System.out.println(getBuilding());
        System.out.println(A.getClassName());
        System.out.println(A.getLocation());
    }
}
