package eResource;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"eResource"})
//@Component
//@Resource(name = "one",type = One.class)
public class Two {
    @Resource
    private One one;

    public One getOne() {
        return one;
    }
//    @Resource
    public void setOne(One one) {
        this.one = one;
    }

    public void save(){
        one.save();
    }

    public Two() {
        System.out.println("two构造器");
    }

    public Two(One one) {
        this.one = one;
    }
}
