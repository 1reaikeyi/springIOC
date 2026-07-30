package 反射;

public class Test {
    public static void main(String[] args) {
//        1
        Class stu1 = Stu.class;
        System.out.println("stu1 = " + stu1);
//        System.out.println("stu1.getName() = " + stu1.getName());
        System.out.println("stu1.getName() = " + stu1.getSimpleName());
//      2
        Stu stu2 = new Stu();
        Class stu2Class = stu2.getClass();
        System.out.println("stu2Class = " + stu2Class);
//        3
        Class stu3Class = null;
        try {
            stu3Class = Class.forName("反射.Stu");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("stu3Class = " + stu3Class);
    }
}
