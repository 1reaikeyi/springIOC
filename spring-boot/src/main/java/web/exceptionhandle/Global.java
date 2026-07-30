package web.exceptionhandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global {
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleException(Exception e) {
        return "global错误"+e.getMessage();
    }
}
