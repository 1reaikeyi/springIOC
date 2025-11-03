package ajbdc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("ajbdc")
@Component("account")
public class Account {
    private String accountant;
    private int money;
    public Account() {

    }

    public Account(String accountant, int money) {
        this.accountant = accountant;
        this.money = money;
    }

    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    public int getmoney() {
        return money;
    }

    public void setmoney(int money) {
        this.money = money;
    }
}
