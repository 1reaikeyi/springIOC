package yu;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class Request {

    @RequestMapping("/http")
    public String testservlet(HttpServletRequest request) {
        request.setAttribute("message", "httpservlrtr_value");
        System.out.println("http"+request.getAttribute("message"));
        System.out.println(request.getClass());
        return "www";
    }
    @RequestMapping("/model")
    public String testservlet(Model model) {
        model.addAttribute("message", "model_value");
        System.out.println("model:"+model.getAttribute("message"));
        System.out.println(model.getClass());
        return "www";
    }
    @RequestMapping("/map")
    public String testservlet(Map<String, Object> map) {
        map.put("message", "map共享数据");
        System.out.println("Map:"+map.get("message"));
        System.out.println(map.getClass());
        return "www";
    }
    @RequestMapping("/modelmap")
    public String testservlet(ModelMap modelMap) {
        modelMap.addAttribute("message", "modelmap_value");
        System.out.println("ModelMap:"+modelMap.get("message"));
        System.out.println(modelMap.getClass());
        return "www";
    }
    @RequestMapping("/modelAndView")
    public ModelAndView testservlet() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "modelandview_value");
        System.out.println("ModelAndView:"+modelAndView.getModel());
        System.out.println(modelAndView.getClass());
        modelAndView.setViewName("www");
        return modelAndView;
    }
}
