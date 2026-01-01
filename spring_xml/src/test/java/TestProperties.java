import a8properties.JDBC;
import a8properties.SettingProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("8properties.xml");
        JDBC jdbc = context.getBean("jdbc", JDBC.class);
        System.out.println("jdbc = " + jdbc);
        SettingProperties settingProperties = (SettingProperties) context.getBean("properties");
        settingProperties.print();
    }
}
