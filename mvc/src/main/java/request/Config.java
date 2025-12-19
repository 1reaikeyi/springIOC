package request;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Config {
    @RequestMapping("/request")
    public String request() {
        return "Request";
    }

}
