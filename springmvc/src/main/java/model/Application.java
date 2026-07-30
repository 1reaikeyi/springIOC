package model;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Application {

    @RequestMapping("/httpApplication")
    public String session(HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        application.setAttribute("application_message", "application_value");
        System.out.println(application.getAttribute("application_message"));
        System.out.println(application.getClass());
        return "www";
    }
}
