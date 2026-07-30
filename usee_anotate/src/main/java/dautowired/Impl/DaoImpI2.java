package dautowired.Impl;

import dautowired.Dao;
import org.springframework.stereotype.Component;

@Component("DaoImpl2")
public class DaoImpI2 implements Dao {


        @Override
        public void save() {
            System.out.println("2正在保存");
        }

}
