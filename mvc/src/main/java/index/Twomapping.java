package index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class Twomapping {
    @RequestMapping("/two")
    public String two() {
        return "Two";
    }
}
