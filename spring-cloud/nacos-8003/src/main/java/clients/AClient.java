package clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("nacos-8001")
public interface AClient {
    @PostMapping("/one")
    String two();
}
