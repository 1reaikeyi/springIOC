package springboot.bean.pro;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("address")
@Component
public class A {
    private String Building;
    private B room;


    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public B getRoom() {
        return room;
    }

    public void setRoom(B b) {
        this.room = b;
    }
    public void show() {
        System.out.println(getBuilding());
        System.out.println(room.getClassName());
        System.out.println(room.getLocation());
    }
}
