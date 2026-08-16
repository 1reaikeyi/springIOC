package mvc.model;

import java.util.LinkedHashMap;

/**
 * ClassName: 【17】model.ModelMap
 * Description: 将数据存储到域中。

 */
public class ModelMap extends LinkedHashMap<String, Object> {
    public ModelMap() {
    }

    /**
     * 向域当中绑定数据
     * @param name
     * @param value
     * @return
     */
    public ModelMap addAttribute(String name, String value){
        this.put(name, value);
        return this;
    }
}

