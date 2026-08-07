package n8002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class One {

    @RequestMapping("/one")
    public String one() {
        return "two";
    }
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/two")
    public String three() {
        String url = "http://nacos-8001/one";
        return restTemplate.getForObject(url, String.class);
    }

}
