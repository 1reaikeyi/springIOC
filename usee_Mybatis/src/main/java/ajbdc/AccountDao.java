package ajbdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public Account select(String act){
        String sql = "select * from account where account = ? ";
        Account account = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Account>(Account.class),act);
        return account;
    }
    public int update(Account account){
        String sql = "update account set balance=? where accountant=?";
        int i = jdbcTemplate.update(sql,account.getAccountant(),account.getmoney());
        return i;
    }

}
