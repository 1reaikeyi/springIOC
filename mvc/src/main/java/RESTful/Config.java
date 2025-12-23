package RESTful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Config {
    @RequestMapping("restful")
    public String test(){
        return "ok";
    }
}
