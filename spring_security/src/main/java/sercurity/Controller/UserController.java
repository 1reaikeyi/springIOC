package sercurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @RequestMapping("/hello")
    public String user(Principal principal) {
        return "登录成功----" + principal;
    }
}
