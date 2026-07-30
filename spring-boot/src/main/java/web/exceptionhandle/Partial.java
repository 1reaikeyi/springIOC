package web.exceptionhandle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Partial {
    @ResponseBody
    @RequestMapping("/restful/{id}")
    public String test(@PathVariable("id") int id) {
        if (id == 0) {
            throw new IllegalArgumentException("id is !=0");
        }
        return "id="+id;
    }
    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    public String exceptionHandler(RuntimeException e) {
        return "partial错误："+e.getMessage();
    }
}
