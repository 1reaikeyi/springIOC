package n8003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceClientImpl;

@RestController
public class One {
    @Autowired
    private ServiceClientImpl serviceClientImpt;

    @RequestMapping("/one")
    public String one() {
        return "three";
    }
    @PostMapping("/two")
    public String two() {
        return serviceClientImpt.a();
    }
    @PostMapping("/three")
    public String three() {
        return serviceClientImpt.b();
    }
}
