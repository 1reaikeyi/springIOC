package RESTful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Index {
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String getAll(){
        System.out.println("正在查询getALL");
        return "www";
    }
    @RequestMapping(value = "user/{ID}",method = RequestMethod.GET)
    public String getID(@PathVariable("ID") String id){
        System.out.println("正在查询------>"+id);
        return "www";
    }
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String save(Use usee){
        System.out.println("添加用户-----");
        System.out.println(usee);
        return "www";
    }
    @RequestMapping(value = "user",method = RequestMethod.PUT)
    public String update(Use usee){
        System.out.println("更改用户----");
        System.out.println(usee);
        return "www";
    }
    @RequestMapping(value = "user/{ID}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("ID") String id){
        System.out.println("删除用户----"+id);
        return "www";
    }

}
