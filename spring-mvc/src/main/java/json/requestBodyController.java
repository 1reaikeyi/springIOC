package json;

import json.config.User;
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
public class requestBodyController {
    @RequestMapping("/requestBody")
    public String save(@RequestBody String name){
        System.out.println(name);
        return "ok";
    }

    @RequestMapping(value = "/ajaxRequest",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> ajaxPost(RequestEntity<User> responseEntity){
//        System.out.println("responseEntity = " + responseEntity);
//        HttpMethod method = responseEntity.getMethod();
//        System.out.println("method = " + method);
        User use = responseEntity.getBody();
        System.out.println("use = " + use);
//        URI uri = responseEntity.getUrl();
//        System.out.println("uri = " + uri);
//        HttpHeaders headers = responseEntity.getHeaders();
//        System.out.println("headers = " + headers);
        return ResponseEntity.ok(use.toString());
    }

    @RequestMapping(value = "/ajaxResponse",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> ajaxPost(@RequestBody User use) {
        return ResponseEntity.ok(use.toString());
    }

}
