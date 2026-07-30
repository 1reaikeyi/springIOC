package a7spring_p_c_util;

import java.util.List;

public class Usee {
    private String name;
    private int id;
    private String job;
    public Usee() {

    }
    public Usee(String name, int id, String job) {
        this.name = name;
        this.id = id;
        this.job = job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Usee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", job='" + job + '\'' +
                '}';
    }

}
