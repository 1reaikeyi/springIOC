package bmybatis;

import java.util.List;

public class DaoImpl implements Dao {
    @Override
    public int insert(Account account) {
        int i = 0;
        try {
            i = sqlSession.insert("insert", account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public int delete(String accountant) {
        return 0;
    }

    @Override
    public Account selectById(String accountant) {
        return null;
    }

    @Override
    public List<Account> selectAll() {
        return List.of();
    }
}
