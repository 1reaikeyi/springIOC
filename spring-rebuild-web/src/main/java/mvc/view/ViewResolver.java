package mvc.view;

import java.util.Locale;

/**
 * ClassName: 【10】view.ViewResolver
 * Description:视图解析器接口
 */
public interface ViewResolver {
    /**
     * 解视图解析，将逻辑视图名转换为物理视图名，并且返回视图对象。
     * @param viewName
     * @param locale
     * @return
     * @throws Exception
     */
    View resolveViewName(String viewName, Locale locale) throws Exception;
}

