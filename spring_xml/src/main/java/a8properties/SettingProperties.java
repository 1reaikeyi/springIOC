package a8properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SettingProperties {
    //    properties
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void print() {
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
        for(Map.Entry<Object, Object> entry : entrySet) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
