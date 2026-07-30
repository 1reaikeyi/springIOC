package Brequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Vague {
    //    /x?z 不匹配：1./xz（缺少一个字符），2. /x?z（完全一样）
//    @RequestMapping("/?x")
//    public String vague1() {
//        return "One";
//    }
    //    /x*z 不可匹配：包含任意非 / ,?字符（或无字符）
//    @RequestMapping("/*x")
//    public String vague2() {
//        return "One";
//    }
    //    /x**z 不匹配：路径不以 /,? 开头；
//    @RequestMapping("/**x")
//    public String vague3() {
//        return "One";
//    }
    @RequestMapping("/{username}/{password}")
    public String login(@PathVariable
                            String username,
                        @PathVariable
                        String password) {
        System.out.println("用户名：" + username+"\t密码："+password);
        return "One";

    }
}
