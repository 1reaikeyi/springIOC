package expection;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExpectionController {
    @RequestMapping(value = "/post",method = RequestMethod.GET)
    public String expection() {
        return "post";
    }
    @RequestMapping(value = "/expection",method = RequestMethod.GET)
    public String test() {
     return "test";
    }

}
