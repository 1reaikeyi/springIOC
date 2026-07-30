package json.config;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Config {
    @RequestMapping("/json")
    public String request() {
        return "json";
    }
    @RequestMapping("/ajax")
    public String ajax() {
        return "ajax";
    }
    @RequestMapping("/boby")
    public String request2() {
        return "boby";
    }


}
