package http;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/analysis")
public class Analysis extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse res){
//                String name = req.getParameter("id");
//                String pass = req.getParameter("pass");
//                System.out.println("name = " + name);
//                System.out.println("pass = " + pass);
                // 获取请求方法
                String method = req.getMethod();
                System.out.println("method = " + method);
                // 获取请求头
                String userAgent = req.getHeader("User-Agent");
                System.out.println("userAgent = " + userAgent);
                // 获取访问路径
                String contextPath = req.getContextPath();
                System.out.println("contextPath = " + contextPath);
                // 获取请求URI和查询字符串
                String requestURI = req.getRequestURI();
                System.out.println("requestURI = " + requestURI);
                //获取全路径
                StringBuffer String = req.getRequestURL();
                System.out.println("String = " + String);
                // 获取查询字符串
                String quetyString = req.getQueryString();
                System.out.println("quetyString = " + quetyString);

                System.out.println("public void doGet(HttpServletRequest req, HttpServletResponse res)收到get method");
        }

        public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//                PrintWriter id = res.getWriter();
//                id.println("id");
//                PrintWriter pass = res.getWriter();
//                pass.println("pass");
                String id = req.getParameter("id");
                String pass = req.getParameter("pass");
                System.out.println("id = " + id);
                System.out.println("pass = " + pass);
                String method = req.getMethod();
                System.out.println("method = " + method);
                String userAgent = req.getHeader("User-Agent");
                System.out.println("userAgent = " + userAgent);
                String contextPath = req.getContextPath();
                System.out.println("contextPath = " + contextPath);
                String requestURI = req.getRequestURI();
                System.out.println("requestURI = " + requestURI);
                StringBuffer String = req.getRequestURL();
                System.out.println("String = " + String);
                String quetyString = req.getQueryString();
                System.out.println("quetyString = " + quetyString);
                //获取请求内容
                BufferedReader br = req.getReader();
                String str = br.lines().toString();

                System.out.println("str = " + str);
                br.close();
                System.out.println("public void doGet(HttpServletRequest req, HttpServletResponse res)收到post method");
        }
}
