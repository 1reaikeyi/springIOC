package life;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/life")
public class Index  extends HttpServlet {
        private int countservice = 0;
        public Index() {
            System.out.println("1,创建know对象" + this);
        }
        @Override
        public void init(ServletConfig servletConfig) {
            System.out.println("2,执行init方法");
        }
        @Override
        public ServletConfig getServletConfig() {
            return null;
        }

        @Override
        public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            // 设置响应类型为HTML，支持中文
            servletResponse.setContentType("text/html;charset=UTF-8");
            // 获取客户端输出流
            PrintWriter out = servletResponse.getWriter();

            System.out.println(Thread.currentThread().getName());
            // 同步计数，确保线程安全
            synchronized (this) {
                countservice++;

                // 控制台输出原信息
                System.out.println("3,执行service方法" + "第" + countservice + "个人访问");
                // 向客户端浏览器输出信息
                out.println("<h1>当前是第 " + countservice + " 次访问</h1>");
                // 关闭输出流
                out.close();
            }
        }

        @Override
        public String getServletInfo () {
                return "作者：xxx；版本：1.0；功能：处理用户登录请求（已新增访问统计响应）";
        }
        @Override
        public void destroy () {
                System.out.println("4,执行destroy方法");
        }


}
