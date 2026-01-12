package springbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("address")
@Configuration
public class Apro {
    private String Building;
    private A room;


    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public A getRoom() {
        return room;
    }

    public void setRoom(A a) {
        this.room = a;
    }
    public void show() {
        System.out.println(getBuilding());
        System.out.println(room.getClassName());
        System.out.println(room.getLocation());
    }
}
