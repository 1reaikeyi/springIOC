package index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class Onemapping {
    @RequestMapping("/one")
    public String one() {
        return "One";
    }
}
