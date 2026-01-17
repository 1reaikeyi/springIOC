package json;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import request.config.User;

import java.io.IOException;
import java.io.PrintWriter;


//@RestController
@Controller
public class AJAXController {
//    @GetMapping("/http")
//    public void ajax(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        PrintWriter out = response.getWriter();
//        out.println("welcome to 王者峡谷------------------------");
//        System.out.println("welcome to 王者峡谷");
//    }

    @RequestMapping(value = "/ajaxGet",method = RequestMethod.GET)
    @ResponseBody
    public String responsebody(){
        return "open get ai";
    }

    @RequestMapping(value = "/ajaxPost",method = RequestMethod.POST)
    @ResponseBody
    public String ajaxPost(@RequestBody User use){
        System.out.println(use);
        return "open post ai";
    }




}