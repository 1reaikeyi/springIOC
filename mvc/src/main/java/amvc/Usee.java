package amvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class Usee {
    @RequestMapping("/Main")
    public String index() {
        return "main";
    }
//    web 配置 → mvc 配置 → 控制器（Main） → 视图（index）
}
