package AJAX;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//@RestController
@Controller
public class AJAXController {
//    @GetMapping("/ajax")
//    public void ajax(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        PrintWriter out = response.getWriter();
//        out.println("welcome to 王者峡谷------------------------");
//        System.out.println("welcome to 王者峡谷");
//    }
    @RequestMapping(value = "/ajaxGet",method = RequestMethod.GET)
    @ResponseBody
    public String responsebody(){
        System.out.println("welcome---------------王者峡谷");
        return "open ai";
    }
    @RequestMapping(value = "/ajaxPost",method = RequestMethod.POST)
    @ResponseBody
    public String ajaxPost(@RequestBody Use use){
        System.out.println(use);
        return "open post ai";
    }



}