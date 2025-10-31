package bmybatis;

import java.util.List;

public interface Dao {
    int insert(Account account);
    int update(Account account);
    int delete(String accountant);
    Account selectById(String accountant);
    List<Account> selectAll();
}
