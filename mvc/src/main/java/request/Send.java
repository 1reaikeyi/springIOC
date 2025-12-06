package request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Send {
    @RequestMapping(value = "/send")
    public String send(){
        return "Send";  // 返回视图名称
    }

    @RequestMapping(value = "/params", params = {"username", "password"})
    public String params(){
        return "Send";  // 返回视图名称
    }
    @RequestMapping(value = "header", headers = {"Referer", "host"})
    public String header(){
        return "Send";  // 返回视图名称
    }
}
