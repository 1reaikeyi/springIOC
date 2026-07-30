package dAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
@Configuration

@Service
public class One {

    @Autowired
    @Qualifier("daoImpl1")
    private Dao dao1;
    public One() {

    }
//
//    @Autowired
//    public One(@Qualifier("daoImpl1") Dao dao1) {
//        System.out.println("One的有参构造");
//        this.dao1 = dao1;
//    }

    public void test() {
        dao1.save();
        System.out.println("--------------------");
    }

}
