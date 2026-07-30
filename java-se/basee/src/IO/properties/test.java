package IO.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("basee/src/IO/properties/first.properties"));
        System.out.println(p);
        p.store(new FileWriter("basee/src/IO/properties/second.properties"),"properties");


    }
}