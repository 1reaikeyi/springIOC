package test;

import mvc.annotion.Controller;
import mvc.annotion.RequestMapping;
import mvc.method.RequestMethod;

@Controller
public class UseController {
    @RequestMapping(value = "/use",method = RequestMethod.GET)
    public String index(){
        return "use";
    }
}
