package request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Send {

    @RequestMapping(value = "/params", params = {"username", "password"})
    public String params(){
        return "Vague";  // 返回视图名称
    }
    @RequestMapping(value = "header", headers = {"Referer", "host"})
    public String header(){
        return "Vague";
    }
}
