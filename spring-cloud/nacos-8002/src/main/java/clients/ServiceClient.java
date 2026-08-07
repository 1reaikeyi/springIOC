package clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("nacos-8001")
public interface ServiceClient {
    @PostMapping("/one")
    String two();
}
