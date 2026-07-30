package IO;

import java.io.*;

public class ByteRead {
    public static void main(String[] args) {
        try (InputStream fileInputStream = new FileInputStream(new File("basee/src/IO/example"));){
            int read = fileInputStream.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        //readAllBytes()
        try {
            InputStream fileInputStream = new FileInputStream("basee/src/IO/example");
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //缓冲流
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("basee/src/IO/example"));){
            int read ;
            while ((read = bufferedInputStream.read())!=-1) {
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
