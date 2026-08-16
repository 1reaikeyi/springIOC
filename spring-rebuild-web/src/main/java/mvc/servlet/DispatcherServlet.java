package mvc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: servlet.DispatcherServlet
 * Description: 请求 -> dispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
    private static final String FILE_PREFIX = "classpath:";
    @Override
    public void init() throws ServletException {
        String contextConfigLocation = super.getInitParameter("contextConfigLocation");
        System.out.println("加载的配置文件是: " + contextConfigLocation);
        if (contextConfigLocation.trim().startsWith(FILE_PREFIX)) {
            InputStream path = this.getServletContext().getClassLoader().getResourceAsStream(contextConfigLocation.substring(FILE_PREFIX.length()));
            System.out.println("path = " + path);
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

    /**
     * 处理请求的核心方法
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}

