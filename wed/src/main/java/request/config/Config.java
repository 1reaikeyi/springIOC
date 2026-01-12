package request.config;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Config {
    @RequestMapping("/request")
    public String request() {
        return "request";
    }
    @RequestMapping("/forward")
    public String config(){
        return "forward";
    }
    @RequestMapping("/redirect")
    public String redirect(){
        return "forward";
    }
    @RequestMapping("/RESTful")
    public String json(){
        return "RESTful";
    }

}
