import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import sercurity.SecurityApplication;

@SpringBootTest(classes = SecurityApplication.class)
public class TestPassword {
    @Resource
    private PasswordEncoder passwordEncoder;
    @Test
    public void test() {
        String password = "小米";
        String encode = passwordEncoder.encode(password);
        System.out.println(encode);
        boolean matches = passwordEncoder.matches(password, encode);
        System.out.println(matches);
        System.out.println();
        for(int i = 1; i <= 3; i++) {
            String newPassword = passwordEncoder.encode(password);
            System.out.println(newPassword);
            boolean one = passwordEncoder.matches(password, newPassword);
            System.out.println(one);
        }
    }
    /**
     * $2a$10$jD43qhjp/HGP8dY1pgcW7OtFFyxn4d2MgNk1KbGndDyU7Ly97xth.
     * true
     * $2a$10$0i.hrpt0k1EIQ62UTOgtVu/PfEQ1pNBJzpSlLWghDUITjIH8.atKu
     * true
     * $2a$10$Q9rgbq/NPasycDu4TyRfJudETDpjdkmN7VLTnb3WeI7BjNZQgKRVq
     * true
     */
}
