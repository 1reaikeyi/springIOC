package request.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Controller
public class UploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String uploadFile(MultipartFile file) {
//        String fileName = file.getName();
//        System.out.println("文件变量名= " + fileName);
        String originalFilename = file.getOriginalFilename();
        System.out.println("originalFilename = " + originalFilename);
        //读取客户传送文件内容
        try (InputStream inputStream = file.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            StringBuilder content = new StringBuilder();
            String enter;
            while ((enter = reader.readLine()) != null) {
                content.append(enter).append("\n");
            }
            System.out.println("文件内容:\n" + content.toString());

        } catch (IOException e) {
            System.err.println("读取文件内容时发生错误: " + e.getMessage());
            e.printStackTrace();
        }
        //保存到服务端的文件
        String address = "D:\\a.maven-java\\javacode\\spring\\mvc\\src\\main\\java\\file";
        try {
            // 生成UUID作为文件名
            String uuid = UUID.randomUUID().toString();
            // 获取原始文件扩展名
            String extension = "";
            if (originalFilename != null && originalFilename.contains(".")) {
                extension = originalFilename.substring(originalFilename.lastIndexOf("."));
            }

            // 组合UUID文件名和原始扩展名
            String newFileName = uuid + extension;
            // 构建完整的文件路径
            String filePath = address + File.separator + newFileName;
            try (InputStream inputStream = file.getInputStream();
                 BufferedInputStream bufferedInput = new BufferedInputStream(inputStream);
                 FileOutputStream fileOutput = new FileOutputStream(filePath);
                 BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput)) {
                // 1KB缓冲区
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bufferedInput.read(buffer)) != -1) {
                    bufferedOutput.write(buffer, 0, bytesRead);
                }
                System.out.println("文件已成功保存到: " + filePath);
                System.out.println("原始文件名: " + originalFilename);
                System.out.println("新文件名: " + newFileName);
            }
        } catch (IOException e) {
            System.err.println("保存文件时发生错误: " + e.getMessage());
            e.printStackTrace();
        }


        return "ok";
    }
}
