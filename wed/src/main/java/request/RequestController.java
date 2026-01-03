package request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestController {

    @GetMapping("/get")
    public String get() {
        System.out.println("get请求----------");
        return "ok";
    }
    @PostMapping("/post")
    public String post() {
        System.out.println("post请求----------");
        return "ok";
    }
    @RequestMapping(value = "/put", method = {RequestMethod.PUT, RequestMethod.POST})
    public String put() {
        System.out.println("put请求----------");
        return "ok";
    }
    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.POST})
    public String delete() {
        System.out.println("delete请求----------");
        return "ok";
    }
    @RequestMapping(value = "/head", method = {RequestMethod.HEAD, RequestMethod.POST})
    public String head() {
        System.out.println("head请求----------");
        return "ok";
    }
    @RequestMapping(value = "/params", params = {"username = 1", "id != 1"})
    public String params(){
        return "ok";
    }
    @RequestMapping(value = "header", headers = {"Referer", "host"})
    public String header(){
        return "ok";
    }

}
