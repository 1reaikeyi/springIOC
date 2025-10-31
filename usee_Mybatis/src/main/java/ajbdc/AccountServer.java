package ajbdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServer {
    @Autowired
    private AccountDao accountDao;
    public void withdraw(String from, String to,int money) {
        Account a = accountDao.select(from);
        Account b = accountDao.select(to);
        a.setmoney(a.getmoney()-money);
        b.setmoney(b.getmoney()+money);
        int i = accountDao.update(a);
        i +=accountDao.update(b);

    }
}
