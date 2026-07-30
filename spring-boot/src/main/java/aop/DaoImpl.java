package aop;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements Dao{
    @Override
    public void save(String name) {
        System.out.println("Saving " + name);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting " + id);
    }
}
