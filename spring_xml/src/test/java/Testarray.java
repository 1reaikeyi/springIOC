import a5array.SettingList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testarray {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("5array.xml");
        SettingList array1 = context.getBean("array_1", SettingList.class);
        array1.print();
        SettingList array2 = context.getBean("array_2", SettingList.class);
        array2.print();
       SettingList array3 = context.getBean("array_3", SettingList.class);
       array3.print();
       SettingList array4 = context.getBean("array_4", SettingList.class);
       array4.print();
    }
}
