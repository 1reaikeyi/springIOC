package lombok;

import org.junit.jupiter.api.Test;

public class TestBuild {
    @Test
    public void test() {
        Teacher teacher = Teacher.builder()
                .name("zhangsan")
                .job("teacher")
                .addEmail("google")
                .addEmail("openai")
                .build();

        teacher.introduce();
    }
}
