package jjwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;

public class JwtUtil {

    private static final String KEY = "小米xiaomi_secret_key_for_jwt_token_generation";
    // 生成 JJWT 所需的签名密钥
    private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(KEY.getBytes(StandardCharsets.UTF_8));

    // 接收业务数据，生成 token 并返回
    public static String genToken(Map<String, Object> claims) {
        return Jwts.builder()
                // 设置业务自定义 claims (JJWT 0.12.x API)
                .claims(claims)
                // 设置过期时间 (JJWT 0.12.x API)
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 12))
                // 使用 HMAC256 算法签名
                .signWith(SECRET_KEY)
                // 生成最终 token 字符串
                .compact();
    }

    public static Map<String, Object> parseToken(String token) {
        Claims claims = Jwts.parser()
                .verifyWith(SECRET_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();
        return claims;
    }

}