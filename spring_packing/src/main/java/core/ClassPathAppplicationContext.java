package core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathAppplicationContext implements ApplicationContext {
    Map<String, Object> beanDefinitionMap = new HashMap<>();
    public ClassPathAppplicationContext(String configLocation) {
        try {
            SAXReader saxReader = new SAXReader();
            InputStream in = ClassLoader.getPlatformClassLoader().getResourceAsStream(configLocation);
            Document document = saxReader.read(in);
            List<Node> nodes = document.selectNodes("//bean");
            for (Node node : nodes) {
                String id = node.valueOf("@id");
                String className = node.valueOf("@class");
                try {
                    Class<?> clazz = Class.forName(className);
                    Object instance = clazz.getDeclaredConstructor().newInstance();
                    beanDefinitionMap.put(id, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
