package AJAX;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class AJAXController {
//    @GetMapping("/ajax")
//    public void ajax(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        PrintWriter out = response.getWriter();
//        out.println("welcome to 王者峡谷------------------------");
//        System.out.println("welcome to 王者峡谷");
//    }
    @RequestMapping("/ajax")
    @ResponseBody
    public String responsebody(){
        System.out.println("welcome---------------王者峡谷");
        return "welcome 虚拟世界";
    }


}