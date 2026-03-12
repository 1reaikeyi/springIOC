package request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class Templates {
    //多个请求对应一个方法
//    @RequestMapping(value = {"/one","/two"})
    @RequestMapping(path = {"/one","/two"})
    public String one(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("你好");
        return "ok";
    }
}
