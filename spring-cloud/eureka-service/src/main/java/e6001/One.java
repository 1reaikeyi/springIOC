package e6001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class One {

    @RequestMapping("/one")
    public String one() {
        return "one";
    }

}
