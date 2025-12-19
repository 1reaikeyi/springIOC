package cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Templates {
    //多个请求对应一个方法
//    @RequestMapping(value = {"/one","/two"})
    @RequestMapping(path = {"/one","/two"})
    public String one() {
        return "/resources/cookie/second.html";
    }
}
