package e6003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class One {

    @RequestMapping("/one")
    public String one() {
        return "three";
    }
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/in")
    public String in() {
        String url = "http://eureka-service/one";
        return restTemplate.getForObject(url, String.class);
    }

}
