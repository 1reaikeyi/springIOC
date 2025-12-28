package expection;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Expection {
    @ExceptionHandler
    public String handleException(Exception e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "handler";
    }
}
