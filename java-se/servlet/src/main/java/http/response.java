package http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/response")
public class response extends HttpServlet {
    @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        false
//        http://localhost:8080/tomat_complete_war_exploded/http3?id=%22name%22&pass=%22pass%22
        //true
//        http://localhost:8080/tomat_complete_war_exploded/http3?id=name&pass=pass
        String name = req.getParameter("id");
        String pass = req.getParameter("pass");
        if ("name".equals(name) && "pass".equals(pass)) {
            resp.setHeader("Content-Type", "text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>登录成功</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>欢迎登录</h1>\n" +
                    "</body>\n" +
                    "</html>");
            out.close();

        } else {
            resp.setHeader("Content-Type", "text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>登录失败</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>登录失败</h1>\n" +
                    "</body>\n" +
                    "</html>");
            out.close();
        }

    }
}
