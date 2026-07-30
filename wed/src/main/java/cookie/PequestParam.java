package cookie;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PequestParam {
    @RequestMapping("/register")
    public String register() {
        System.out.println("/get");
        return "Form";
    }
    //使用httpServletRequest获取请求参数
//    @RequestMapping("/post")
//    public void post(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println("/post");
//        String name = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println("name = " + name);
//        System.out.println("password = " + password);
//
//    }
    //使用@RequestParam注解获取请求参数
//    @RequestMapping("/post")
//    public String post(@RequestParam("username") String username, @RequestParam("password") String password) {
//        System.out.println("name = " + username);
//        System.out.println("password = " + password);
//        return "www";
//    }
    //使用PoJo对象获取请求参数
    @RequestMapping("/post")
    public String post(Register register) {
        System.out.println(register);
        return "www";
    }

    @RequestMapping("/header")
    public String referer(@RequestHeader(value = "Referer",required = false) String referer,
                        @RequestHeader("host") String host){
        System.out.println("public class PequestHeader");
        System.out.println("referer = " + referer);
        System.out.println("host = " + host);
        return "www";
    }
//    @RequestMapping("/post")
//    public String post(@CookieValue(value = "id",required = false) String id,
//                       @CookieValue(value = "username",required = false) String username){
//        System.out.println("id = " + id);
//        System.out.println("username = " + username);
//        return "www";
//    }
}
