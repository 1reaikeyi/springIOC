package config;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

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
/**
 *     <bean id="userBean" class="pojo.User">
 *         <property name="username" value="张三"></property>
 *         <property name="id" value="18"></property>
 *     </bean>
 */
        try {
            List<Node> nodes = document.selectNodes("//bean");
            //class
            for (Node node : nodes) {
                Element element = (Element) node;
                String id = element.attributeValue("id");
                String className = element.attributeValue("class");
                System.out.println("id = " + id);
                System.out.println("className = " + className);
                //通过反射获取对象
                Class<?> aClass = Class.forName(className);
                //获取构造器,创建对象
                Constructor<?> constructor = aClass.getDeclaredConstructor();
                Object object = constructor.newInstance();
                objectMap.put(id, object);
                System.out.println("object = " + object);
            }
            //setter注入
            for (Node node : nodes) {
                Element element = (Element) node;
                String id = element.attributeValue("id");
                String className = element.attributeValue("class");
                List<Element> property = element.elements("property");
                if (property.isEmpty()) {
                    continue;
                };
                System.out.println("property = " + property);
                //反射创建对象
                Class<?> aClass = Class.forName(className);
                Object targetObject = objectMap.get(id);
                for (Element pro : property) {
                    String propertyName = pro.attributeValue("name");
                    String propertyValue = pro.attributeValue("value");
                    String propertyRef = pro.attributeValue("ref");
                    System.out.println("propertyName = " + propertyName);
                    System.out.println("propertyValue = " + propertyValue);
                    System.out.println("propertyRef = " + propertyRef);

                    // 首先尝试使用属性名生成的标准setter方法名
                    String setterMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                    System.out.println("setterMethodName = " + setterMethodName);
                    //获取属性字段（使用getDeclaredField可以获取private字段）
                    Field field = aClass.getDeclaredField(propertyName);
                    //获取setter方法
                    Class<?> fieldType = field.getType();
                    Method setter = aClass.getMethod(setterMethodName, fieldType);

                    if (propertyRef != null) {
                        Object refObject = objectMap.get(propertyRef);
                        setter.invoke(targetObject, refObject);
                        System.out.println("refObject = " + refObject);
                    }

                    if (propertyValue != null) {
                        Object typeValue = typeValue(propertyValue, fieldType);
                        setter.invoke(targetObject, typeValue);
                        System.out.println("typeValue = " + typeValue);
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
