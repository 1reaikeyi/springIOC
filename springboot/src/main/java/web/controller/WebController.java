package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @RequestMapping("/chat")
    public String chat(@RequestParam("message") String message, Model model) {
        model.addAttribute("K", message);
        return "chat";
    }
}
