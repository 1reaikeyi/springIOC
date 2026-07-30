package servlet;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet", loadOnStartup = 1)
public class servlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("创建servlet对象"+this);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse){
        servletResponse.setContentType("text/html;charset=UTF-8");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
        if (method.equals("GET")) {
           doGet(request, (HttpServletResponse) servletResponse);
        }
        if (method.equals("POST")) {
           doPost(request, (HttpServletResponse) servletResponse);
        }
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        System.out.println("public class servlet implements Servlet收到get method");
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        System.out.println("public class servlet implements Servlet收到post method");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
