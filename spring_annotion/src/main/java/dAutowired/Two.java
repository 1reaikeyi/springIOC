package dAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Two {
    @Autowired
    @Qualifier("daoImpI2")
    private Dao dao;
    public void save() {
        dao.save();
        System.out.println("--------------------");
    }
}
