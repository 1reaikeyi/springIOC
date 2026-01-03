package request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VagueController {
    //    /x?z 不匹配：1./xz（缺少一个字符），2. /x?z（完全一样）
//    @RequestMapping("/?x")
//    public String vague1() {
//        return "ok";
//    }
    //    /x*z 不可匹配：包含任意非 / ,?字符（或无字符）
//    @RequestMapping("/*x")
//    public String vague2() {
//        return "ok";
//    }
    //    /x**z 不匹配：路径不以 /,? 开头；
//    @RequestMapping("/**x")
//    public String vague3() {
//        return "ok";
//    }
}
