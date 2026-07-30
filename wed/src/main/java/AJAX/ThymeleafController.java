package AJAX;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class ThymeleafController {
    @RequestMapping("/save")
    public String save(@RequestBody String name){
        System.out.println("保存中");
        System.out.println(name);
        return "ok";
    }

}
