package dautowired.Impl;

import dautowired.Dao;
import org.springframework.stereotype.Component;

@Component("DaoImpl1")
public class DaoImpl1 implements Dao {
    @Override
    public void save() {
        System.out.println("1正在保存");
    }
}
