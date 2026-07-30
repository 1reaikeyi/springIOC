package model;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes(value = {"session_x", "session_y"})
public class Session {

    @RequestMapping("/httpsession")
    public String session1(HttpSession session) {
        session.setAttribute("session_message", "Hello 你好");
        System.out.println(session.getAttribute("session_message"));
        System.out.println(session.getClass());
//        class org.apache.catalina.session.StandardSessionFacade
        return "www";
    }
    @RequestMapping("/session")
    public String session2(ModelMap model) {
        model.addAttribute("session_message", "Hello,你好");
        model.addAttribute("session_x", "使用@SessionAttributes注解");
        model.addAttribute("session_y", "使用@SessionAttributes注解");
        System.out.println(model.getClass());
        System.out.println(model.get("session_message"));
//        class org.springframework.validation.support.BindingAwareModelMap
        System.out.println(model.get("session_x"));
        System.out.println(model.get("session_y"));
        return "www";
    }
}
