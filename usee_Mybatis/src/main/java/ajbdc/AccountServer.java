package ajbdc;

import bmybatis.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServer implements Dao{
    @Autowired
    private Dao dao;

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
        // 2. 查询转出和转入账户
        Account fromAccount = dao.selectById(from);
        Account toAccount = dao.selectById(to);

        // 3. 校验账户是否存在
        if (fromAccount == null) {
            throw new RuntimeException("转出账户不存在: " + from);
        }
        if (toAccount == null) {
            throw new RuntimeException("转入账户不存在: " + to);
        }

        // 5. 执行转账逻辑
        fromAccount.setmoney(fromAccount.getmoney() - money);
        toAccount.setmoney(toAccount.getmoney() + money);

        // 6. 执行更新并校验结果
        int updateFrom = dao.update(fromAccount);
        int updateTo = dao.update(toAccount);

        if (updateFrom != 1) {
            throw new RuntimeException("转出账户更新失败");
        }
        if (updateTo != 1) {
            throw new RuntimeException("转入账户更新失败");
        }
    }
}