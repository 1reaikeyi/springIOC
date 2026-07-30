package index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Templates {
    //一个请求对应一个方法
    @RequestMapping("/first")
    public String first() {
        return "first";
    }
    @RequestMapping("/second")
    public String second() {
        return "second";
    }
    //多个请求对应一个方法
//    @RequestMapping(value = {"/one","/two"})
    @RequestMapping(path = {"/one","/two"})
    public String one() {
        return "second";
    }
}
