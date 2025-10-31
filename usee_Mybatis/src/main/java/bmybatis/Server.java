package bmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Server {
    @Autowired
    private DaoImpl dao;

    public int insert(Account account) {
        return dao.insert(account);
    }

    public int update(Account account) {
        return dao.update(account);
    }

    public int delete(String accountant) {
        return dao.delete(accountant);
    }

    public Account selectById(String accountant) {
        return dao.selectById(accountant);
    }

    public List<Account> selectAll() {
        return dao.selectAll();
    }
    public void withdraw(String from, String to, int money) {
        Account a = dao.selectById(from);
        Account d = dao.selectById(to);
        a.setmoney(a.getmoney() - money);
        d.setmoney(d.getmoney() + money);
        int i = dao.update(a);
        int j = dao.update(d);
    }
}
