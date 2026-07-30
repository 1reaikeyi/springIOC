package request;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import request.config.User;

@Controller
public class RESTFful {
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String getAll(){
        System.out.println("正在查询getALL");
        return "ok";
    }
    @RequestMapping(value = "user/{ID}",method = RequestMethod.GET)
    public String getID(@PathVariable("ID") String id){
        System.out.println("正在查询------>"+id);
        return "ok";
    }
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String save(User usee){
        System.out.println("添加用户");
        System.out.println(usee);
        return "ok";
    }
    @RequestMapping(value = "user",method = RequestMethod.PUT)
    public String update(User usee){
        System.out.println("更改用户");
        System.out.println(usee);
        return "ok";
    }
    @RequestMapping(value = "user/{ID}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("ID") String id){
        System.out.println("删除用户"+id);
        return "ok";
    }
    @RequestMapping("/{username}/{ID}")
    public String login(@PathVariable String username,@PathVariable String ID) {
        System.out.println("用户名：" + username+"\t密码："+ID);
        return "ok";
    }

}
