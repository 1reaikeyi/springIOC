package RESTful;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("restful")
    public String test(){
        return "ok";
    }
}
