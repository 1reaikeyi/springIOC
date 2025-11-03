import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.junit.Test;

public class Testjbdc {
    @Test
    public  void testInsert() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        int update = jdbcTemplate.update("insert into account(name,money,id) values(?,?,?)", "马小六", 1000, "003");
        System.out.println(update);
    }
    @Test
    public  void testUpdate() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        int update = jdbcTemplate.update("update account set money=? where name=?", 10000, "马小六");
        System.out.println(update);
    }
}
