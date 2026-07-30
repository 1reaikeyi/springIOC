package yu;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes(value = {"session_x", "session_y"})
public class Session {

    @RequestMapping("/httpsession")
    public String session(HttpSession session) {
        session.setAttribute("session_message", "Hello World");
        System.out.println(session.getAttribute("session_message"));
        System.out.println(session.getClass());
        return "www";
    }
    @RequestMapping("/session")
    public String session2(ModelMap model) {
//        model.addAttribute("session_message", "Hello World");
        model.addAttribute("session_x", "使用@SessionAttributes注解");
        model.addAttribute("session_y", "使用@SessionAttributes注解");
        System.out.println(model.getClass());
        System.out.println(model.get("session_message"));
        System.out.println(model.get("session_x"));
        System.out.println(model.get("session_y"));
        return "www";
    }
}
