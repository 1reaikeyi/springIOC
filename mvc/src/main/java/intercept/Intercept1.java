package intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Intercept1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("启动preHandle：1");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("启动postHandle：1");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("启动afterCompletion：1");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
    /**
     * preHandle：在控制器处理方法执行之前执行
     * postHandle：在控制器处理方法执行之后、视图渲染之前执行
     * afterCompletion：在整个请求处理完成（包括视图渲染）之后执行
     *  |3，2，1-》
     *  1执行，2执行，3执行
     *  1，2，3->
     *
     *  2拦截住
     * |3，2，1-》
     * 1执行，2拦截住，3不执行
     * 1->
     *
     * 3拦截住
     * |3，2，1-》
     * 1执行，2执行，3拦截住
     * 1,2->
     */
}
