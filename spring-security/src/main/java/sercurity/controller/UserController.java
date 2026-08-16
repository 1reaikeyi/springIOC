package sercurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/hello")
    public String user(Authentication authentication) {
        System.out.println(authentication);
        return ""+authentication;
    }
}
/**
 * UsernamePasswordAuthenticationToken [Principal=UserPojo(id=1, username=租客张三, password=$2a$10$lj4wtmtvUM8CEmhIKRFq3uWqFvrspOCexKQ4VigSNCVEUPuKLggeS, email=zhangsan@test.com),
 * Credentials=[PROTECTED], Authenticated=true,
 * Details=WebAuthenticationDetails [RemoteIpAddress=0:0:0:0:0:0:0:1, SessionId=116FB66A681437FBEB861A3BD8A6D67C], Granted Authorities=[]]
 */