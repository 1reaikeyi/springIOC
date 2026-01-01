package dAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
@Configuration

@Service
public class One {
//   @org.springframework.beans.factory.annotation.Autowired
//   @Qualifier("DaoImpl1")
//    private Dao dao1;
    @org.springframework.beans.factory.annotation.Autowired
    @Qualifier("DaoImpl1")
    private Dao dao1;
    public One() {
        System.out.println("One的无参构造");
    }
    @Autowired
    public One(@Qualifier("DaoImpl1") Dao dao1) {
        System.out.println("One的有参构造");
        this.dao1 = dao1;
    }

    public void save() {
        dao1.save();
        System.out.println("--------------------");
    }

}
