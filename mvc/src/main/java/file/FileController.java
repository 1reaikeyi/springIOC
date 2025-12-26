package file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String uploadFile(MultipartFile file) {
//        String fileName = file.getName();
//        System.out.println("文件变量名= " + fileName);
        String originalFilename = file.getOriginalFilename();
        System.out.println("originalFilename = " + originalFilename);
        //读取服务端传送文件内容

        return "ok";
    }
}
