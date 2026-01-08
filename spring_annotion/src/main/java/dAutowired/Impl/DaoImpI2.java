package dAutowired.Impl;

import dAutowired.Dao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpI2 implements Dao {
    @Override
    public void save() {
            System.out.println("2正在保存");
        }

}
