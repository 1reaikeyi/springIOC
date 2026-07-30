package web.controller.jaskon;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Jackson {

    User user = new User("李华",18);
    @RequestMapping("/jackson")
    @ResponseBody
    public User index(){
        return user;
    }


}
