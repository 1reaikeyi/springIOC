package lombok;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
@Data
@Builder
public class Teacher {
    private String name;
    private String job;
    @Singular("addEmail")
    private List<String> email;

    public void introduce() {
        log.info("教师信息\n"+"姓名: {}, 职业: {}, 邮箱列表: {}", name, job, email);

    }
}
