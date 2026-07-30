package date;

import java.util.Date;

public class Stu {
    private Date bir;

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public Stu() {
        System.out.println(this);
    }

    public Date getBir() {
        return bir;
    }
}
