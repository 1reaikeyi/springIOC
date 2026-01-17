package file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Config {
    @RequestMapping("/document")
    public String document(){
        return "document";
    }
}
