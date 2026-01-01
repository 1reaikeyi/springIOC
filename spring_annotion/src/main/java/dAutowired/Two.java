package dAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Two {
    @Autowired
    @Qualifier("DaoImpl2")
    private Dao dao1;
    public void save() {
        dao1.save();
        System.out.println("--------------------");
    }
}
