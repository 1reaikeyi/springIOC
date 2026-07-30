package IO;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Coding {
    public static void main(String[] args) throws Exception{
        String s = "zxcv和zxcv";
        //编码1
        byte[] bytes1 = s.getBytes(StandardCharsets.UTF_8);
        //解码1
        String s1 = new String(bytes1, StandardCharsets.UTF_8);
        System.out.println(s1);
        //编码2
        byte[] bytes2 = s.getBytes("GBk");
        //解码2
        String s2 = new String(bytes2, StandardCharsets.UTF_8);
        System.out.println(s2);
    }
}
