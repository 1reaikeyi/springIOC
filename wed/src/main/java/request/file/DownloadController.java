package request.file;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Controller
public class DownloadController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) {
        File file = new File("C:\\Users\\lenovo\\Desktop\\记录内容备份\\bili.jpg");
        // 设置HTTP响应头
        HttpHeaders headers = new HttpHeaders();
        // 设置内容类型
        headers.setContentType(MediaType.IMAGE_JPEG);
        // 作为附件下载
        headers.setContentDispositionFormData("attachment", file.getName());
        try {
            return new ResponseEntity<>(Files.readAllBytes(file.toPath()), headers, HttpStatus.OK);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
