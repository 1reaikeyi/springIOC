package transaction;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String name;
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Account() {

    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getmoney() {
        return money;
    }

    public void setmoney(double money) {
        this.money = money;
    }
}
