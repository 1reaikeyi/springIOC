package config;

import ch.qos.logback.classic.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlAppplicationContext implements ApplicationContext {
    private static Logger logger = (Logger) LoggerFactory.getLogger(ClassPathXmlAppplicationContext.class);
    Map<String, Object> objectMap = new HashMap<>();
    public ClassPathXmlAppplicationContext(String configLocation) {
        SAXReader saxReader = new SAXReader();
        Document document = null;
        try {
            InputStream in  = new FileInputStream(configLocation);
            document = saxReader.read(in);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            //获取<标签/>
            List<Node> nodes = document.selectNodes("//bean");
            for (Node node : nodes) {
                Element element = (Element) node;
                String id = element.attributeValue("id");
                logger.info("id = " + id);
                String className = element.attributeValue("class");
                logger.info("className = " + className);
                //通过反射获取对象
                Class<?> aClass = Class.forName(className);
                //获取构造器,创建对象
                Constructor<?> constructor = aClass.getDeclaredConstructor();
                Object object = constructor.newInstance();
                objectMap.put(id, object);
                logger.info("object = " + object);
            }
            System.out.println();
            //setter注入
            for (Node node : nodes) {
                Element element = (Element) node;
                String id = element.attributeValue("id");
                String className = element.attributeValue("class");
                List<Element> property = element.elements("property");
                if (property.isEmpty()) {
                    continue;
                };
                logger.info("className = " + className);
                //反射创建对象
                Class<?> aClass = Class.forName(className);
                Object targetObject = objectMap.get(id);
                for (Element pro : property) {
                    String propertyName = pro.attributeValue("name");
                    String propertyValue = pro.attributeValue("value");
                    String propertyRef = pro.attributeValue("ref");
                    logger.info("propertyName = " + propertyName);
                    logger.info("propertyValue = " + propertyValue);
                    logger.info("propertyRef = " + propertyRef);

                    // 首先尝试使用属性名生成的标准setter方法名
                    String setterMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                    logger.info("尝试setterMethodName = " + setterMethodName);

                    //获取属性字段（使用getDeclaredField可以获取private字段）
                    Field field = aClass.getDeclaredField(propertyName);
                    //获取setter方法
                    Class<?> fieldType = field.getType();
                    Method setter = aClass.getMethod(setterMethodName, fieldType);

                    if (propertyRef != null) {
                        Object refObject = objectMap.get(propertyRef);
                        setter.invoke(targetObject, refObject);
                        logger.info("成功注入引用: " + propertyRef + " 到 " + className + "\t" + propertyName);
                    }

                    if (propertyValue != null) {
                        Object typeValue = typeValue(propertyValue, fieldType);
                        setter.invoke(targetObject, typeValue);
                        logger.info("成功注入值: " + propertyValue + " 到 " + className + "\t" + propertyName);
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) {
        return objectMap.get(beanName);
    }

    private Object typeValue(String value, Class<?> targetType) {
        if (value == null) {
            return null;
        }
        // String类型
        if (targetType == String.class) {
            return value;
        }
        // 基本类型和包装类型
        if (targetType == int.class || targetType == Integer.class) {
            return Integer.parseInt(value);
        }
        if (targetType == double.class || targetType == Double.class) {
            return Double.parseDouble(value);
        }
        return value;
    }


}
