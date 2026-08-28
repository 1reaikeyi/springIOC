package mvc.context;

import jakarta.servlet.ServletContext;

public class WebApplication extends ApplicationContext{

    private ServletContext servletContext;
    private String contextPath;

    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public WebApplication(ServletContext servletContext, String contextPath) {
        super(contextPath);
        this.servletContext = servletContext;
    }

}
