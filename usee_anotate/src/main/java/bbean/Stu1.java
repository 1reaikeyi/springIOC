package bbean;

import org.springframework.stereotype.Service;

@Service()
//@Service省率value值.bean=类名首字母小写
public class Stu1 {
    public Stu1() {
        System.out.println("Stu1对象");
    }
}
