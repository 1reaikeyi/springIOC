package 反射;

import java.lang.reflect.Method;

public class Testmethod {
    public static void main(String[] args) throws Exception {
        Class stu1 = Stu.class;
        Method[] methods = stu1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        //调用方法
        Stu stu = new Stu();
        Method add = stu1.getDeclaredMethod("add", null);
        add.invoke(stu, null);
    }
}
