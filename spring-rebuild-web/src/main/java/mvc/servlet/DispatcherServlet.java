package mvc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.context.WebApplication;

import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * ClassName: servlet.DispatcherServlet
 * Description: 请求 -> dispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
    private static final String FILE_PREFIX = "classpath:";
    @Override
    public void init() throws ServletException {
        String contextConfigLocation = super.getServletConfig().getInitParameter("contextConfigLocation");
        if (contextConfigLocation.trim().startsWith(FILE_PREFIX)) {
            URL url = Thread.currentThread().getContextClassLoader().getResource(
                    contextConfigLocation.substring(FILE_PREFIX.length()));
            if(url == null){
                throw new ServletException("资源找不到：" + contextConfigLocation);
            }
            //解码，解决%xx乱码，指定UTF‑8编码
            String path = URLDecoder.decode(url.getPath(), StandardCharsets.UTF_8);
            System.out.println("path = " + path);
            WebApplication webApplication = new WebApplication(super.getServletContext(),path);
            this.getServletContext().setAttribute("webApplication", webApplication);
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

