package 反射;

import java.lang.reflect.Field;

public class Testname {
    public static void main(String[] args) throws Exception {
        Class stu1 = Stu.class;
        Field[] fields = stu1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("只要存在-------------------------");
        Field stu3 = stu1.getDeclaredField("id");
        //赋值
        Stu stu = new Stu();
        stu3.setAccessible(true);
        stu3.set(stu, 100000);
        System.out.println(stu.getId());
        System.out.println("------------------------------");
        //取值
        Object o = stu3.get(stu);
        System.out.println(o);





        Field[] stu2 = stu1.getFields();
        for (Field field : stu2) {
            System.out.println(field.getName());
        }
        System.out.println("只能获取public--------------------------");

    }
}
