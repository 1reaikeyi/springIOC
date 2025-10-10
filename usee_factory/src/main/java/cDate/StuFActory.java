package cDate;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Factory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StuFActory implements FactoryBean<Date> {
    private String datestr;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public StuFActory(String datestr) {
        this.datestr = datestr;
    }
    @Override
    public Date getObject() throws Exception {
        Date date = sdf.parse(datestr);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
