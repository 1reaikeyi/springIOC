package request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Request {

//    @RequestMapping(value = "/get",method = {RequestMethod.GET,RequestMethod.POST})
//    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @GetMapping("/get")
    public String get() {
        System.out.println("get请求----------");
        return "www";
    }
    //    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @PostMapping("/post")
    public String post() {
        System.out.println("post请求----------");
        return "www";
    }
    @RequestMapping(value = "/put", method = {RequestMethod.PUT, RequestMethod.POST})
    public String put() {
        System.out.println("put请求----------");
        return "www";
    }
    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.POST})
    public String delete() {
        System.out.println("delete请求----------");
        return "www";
    }
    @RequestMapping(value = "/head", method = {RequestMethod.HEAD, RequestMethod.POST})
    public String head() {
        System.out.println("head请求----------");
        return "www";
    }
    @RequestMapping(value = "/params", params = {"username", "password"})
    public String params(){
        return "www";
    }
    @RequestMapping(value = "header", headers = {"Referer", "host"})
    public String header(){
        return "www";  // 返回视图名称
    }

}
