package 集合map;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Propertiess {
    public static void main(String[] args) {
        // 创建Properties对象
        Properties props = new Properties();

        try {
            // 使用InputStreamReader指定UTF-8编码加载properties文件
            props.load(new InputStreamReader(
                    new FileInputStream("D:\\a.maven-java\\javacode\\java基础\\api\\src\\集合map\\file.properties"),
                    StandardCharsets.UTF_8
            ));
            // 获取所有键值对
            System.out.println("Properties文件内容:");
            for (String key : props.stringPropertyNames()) {
                String value = props.getProperty(key);
                System.out.println(key + " = " + value);
            }

            // 获取特定键的值
            System.out.println("\n获取特定键的值:");
            System.out.println("小明: " + props.getProperty("小明"));
            System.out.println("小红: " + props.getProperty("小红"));
            System.out.println("小蓝: " + props.getProperty("小蓝"));
            System.out.println("小绿: " + props.getProperty("小绿"));

        } catch (IOException e) {
            System.out.println("读取文件出错: " + e.getMessage());
        }finally {
            props.clear();
            System.out.println("properties文件已清空");
        }
    }
}
