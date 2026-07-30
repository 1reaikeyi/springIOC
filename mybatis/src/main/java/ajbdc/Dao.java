package ajbdc;

import bmybatis.Account;

import java.util.List;

public interface Dao {
    int insert(bmybatis.Account account);
    int update(bmybatis.Account account);
    int delete(String accountant);
    bmybatis.Account selectById(String accountant);
    List<Account> selectAll();
}
