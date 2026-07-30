package request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Send {

//    @RequestMapping(value = "/params", params = {"username", "password"})
//    public String params(){
//        return "Vague";  // 返回视图名称
//    }
//    @RequestMapping(value = "header", headers = {"Referer", "host"})
//    public String header(){
//        return "Vague";
//    }
    @RequestMapping(value = "/params")
    public String params(@RequestParam("username") String username,
                         @RequestParam("password") String password){
        System.out.println("用户名: " + username);
        System.out.println("密码: " + password);
        return "Vague";
    }

    @RequestMapping(value = "/header")
    public String header(@RequestHeader(value = "Referer", required = false) String referer,
                         @RequestHeader(value = "host", required = false) String host){
        System.out.println("Referer: " + referer);
        System.out.println("Host: " + host);
        return "Vague";
    }
}
