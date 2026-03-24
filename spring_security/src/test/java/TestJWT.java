import io.jsonwebtoken.Claims;
import jjwt.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sercurity.SecurityApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest(classes = SecurityApplication.class)
public class TestJWT {
    @Test
    public void testJWT() {
//        Map<String, Object> claims = new HashMap<String, Object>();
//        claims.put("id", "1");
//        claims.put("email", "admin@test.com");
//        String token = JwtUtil.genToken(claims);
//        System.out.println(token);

        Map<String, Object> getClaims = JwtUtil.parseToken("eyJhbGciOiJIUzM4NCJ9." +
                "eyJpZCI6IjEiLCJlbWFpbCI6ImFkbWluQHRlc3QuY29tIiwiZXhwIjoxNzczNTM0MDc3fQ." +
                "GJYO1Q4f9CfG4mmLU3K3VFDBzTZrk-_idgDUytABDdQVOC9z6GR1WOdr1Y_wKpPz");
        System.out.println(getClaims);
    }
}
