package sercurity.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity(prePostEnabled = true)
public class RoleService {
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @RequestMapping("/select")
    public String select() {
        return "hasRole('USER') or hasRole('ADMIN')+select";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/delete")
    public String delete() {
        return "hasRole('ADMIN') + delete";
    }
    //浏览器请求 ──→ Session Cookie (JSESSIONID) ──→ 服务器 Session 存储 Authentication
}