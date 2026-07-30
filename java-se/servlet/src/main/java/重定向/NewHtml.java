package 重定向;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/forward")
public class NewHtml extends HttpServlet {
    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws jakarta.servlet.ServletException, java.io.IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp) throws jakarta.servlet.ServletException, java.io.IOException {
       resp.setStatus(302);
       //设置响应头，重定向到指定的URL
//       resp.setHeader("Location", "https://www.douyin.com/");
        //设置响应头到本地
       resp.setHeader("Location", "two");
    }
}
