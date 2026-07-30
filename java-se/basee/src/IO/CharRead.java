package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CharRead {
    public static void main(String[] args) {
        try (Reader fileReader = new FileReader(new File("basee/src/IO/example"));){
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //缓冲流
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("basee/src/IO/example"));){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //转换流
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("basee/src/IO/example"),
                                                                                                StandardCharsets.UTF_8);){
            int read;
            while ((read = inputStreamReader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
