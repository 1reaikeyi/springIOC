package mvc.view;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Map;

/**
 * ClassName: 【12】view.View
 * Description:
 */
public interface View {
    /**
     * 获取响应的内容类型
     * @return
     */
    String getContentType();

    /**
     * 渲染
     * @param model
     * @param request
     * @param response
     * @throws Exception
     */
    void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
            throws Exception;
}

