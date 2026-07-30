package AJAX;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URI;

@Controller
public class Request {
    @RequestMapping(value = "/ajaxRequest",method = RequestMethod.POST)
    @ResponseBody
    public String ajaxPost(RequestEntity<Use> responseEntity){
        System.out.println("responseEntity = " + responseEntity);
        HttpMethod method = responseEntity.getMethod();
        System.out.println("method = " + method);
        Use use = responseEntity.getBody();
        System.out.println("use = " + use);
        URI uri = responseEntity.getUrl();
        System.out.println("uri = " + uri);
//        HttpHeaders headers = responseEntity.getHeaders();
//        System.out.println("headers = " + headers);
        return "RequestEntity";
    }
    @RequestMapping(value = "/ajaxResponse",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> ajaxPost(@RequestBody Use use) {
        return ResponseEntity.ok(use.toString());
    }
}
