package 反射;

import java.lang.reflect.Constructor;

public class Testconstructor {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class stu1 = Stu.class;
        Constructor[] constructors = stu1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("------------------");
        Constructor<?> constructor2 = stu1.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2);
        System.out.println("------------------");
        Stu stu3 = (Stu) stu1.newInstance();
        System.out.println(stu3);
    }
}
