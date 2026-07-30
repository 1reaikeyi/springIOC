package lombok;

import org.junit.jupiter.api.Test;

public class TestLombok {
    @Test
    public void test_1() {
        Stu stu = new Stu();
        stu.setAge(20);
        stu.setName("lombok");
        System.out.println(stu);

        Stu stu1 = new Stu("lombok", 20, "gmail");
        System.out.println(stu1);

        Stu stu2 = new Stu("name","qq");
        System.out.println(stu2);

        Stu stu3 = new Stu(20,"qq");
        System.out.println(stu3);
    }
}
