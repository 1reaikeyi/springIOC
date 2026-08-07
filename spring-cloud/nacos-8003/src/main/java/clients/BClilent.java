package clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("nacos-8002")
public interface BClilent {
    @PostMapping("/one")
    String two();
}
