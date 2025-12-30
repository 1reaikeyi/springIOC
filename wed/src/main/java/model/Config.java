package model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Config {
    @RequestMapping("/yu")
    public String test() {
        return "request";
    }
}
