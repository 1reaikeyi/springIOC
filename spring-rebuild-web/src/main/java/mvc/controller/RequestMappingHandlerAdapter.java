package mvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.model.ModelAndView;

/**
 * ClassName: web.RequestMappingHandlerAdapter
 * Description:

 */
public class RequestMappingHandlerAdapter implements HandlerAdapter {
    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return null;
    }
}

