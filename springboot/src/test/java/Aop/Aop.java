package Aop;

import aop.Application;
import aop.DaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)

public class Aop {
    @Autowired
    private DaoImpl dao;
    @Test
    public void test_1(){
        dao.save("小明");
        dao.delete(1);
    }

}
