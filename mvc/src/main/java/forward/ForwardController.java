package forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
    @RequestMapping("/A")
    public String toA(){
//        return "toA";
        return "forward:/C";
    }
    @RequestMapping("/B")
    public String toB(){
        return "redirect:/C";
    }
    @RequestMapping("/C")
    public String toC(){
        return "toC";
    }
}
