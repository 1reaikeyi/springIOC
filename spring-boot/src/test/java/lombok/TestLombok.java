package lombok;

import org.junit.jupiter.api.Test;

public class TestLombok {
    @Test
    public void test1() {
        Stu stu = new Stu("email1","email2");
        stu.setAge(20);
        stu.setName("lombok");
        System.out.println(stu);

        Stu stu1 = new Stu("lombok", "email1", "email2");
        System.out.println(stu1);

        Stu stu2 = new Stu("name","qq");
        System.out.println(stu2);

        Stu stu3 = new Stu("email1","email2");
        System.out.println(stu3);
    }
    @Test
    public void test2() {
        Teacher teacher = Teacher.builder()
                .name("zhangsan")
                .job("teacher")
                .addEmail("google")
                .addEmail("openai")
                .build();

        teacher.introduce();
    }
}
