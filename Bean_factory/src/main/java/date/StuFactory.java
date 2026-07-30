package date;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StuFactory implements FactoryBean<Date> {
    private String datestr;

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public StuFactory(String datestr) {
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
