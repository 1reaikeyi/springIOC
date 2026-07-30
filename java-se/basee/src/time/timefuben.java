package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class date{
    ArrayList<String> datelist = new ArrayList<>();
    String star = "2024-6-8 08:00:00";
    String end = "2024-6-8 10:00:00";
    SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date starstr = str.parse(star);
        Date endstr = str.parse(end);

    public date() throws ParseException {
        datelist.add(String.valueOf(starstr));
        datelist.add(String.valueOf(endstr));

        System.out.println(datelist.get(0));
        System.out.println(datelist.get(1));
    }

}

public class timefuben {
    public static void main(String[] args) throws ParseException {

    String xiaoming  = "2024-6-7 06:00:00";
    String xiaoli  = "2024-6-7 09:00:00";
        SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date xiaomingstr = str.parse(xiaoming);
        Date xiaolistr = str.parse(xiaoli);
        System.out.println(xiaomingstr);
        System.out.println(xiaolistr);
        date d = new date();
        judge(d.starstr,d.endstr,xiaomingstr);
        judge(d.starstr,d.endstr,xiaolistr);

    }
    public static void judge(Date startstr, Date endstr, Date target) {
        if (target.before(startstr) || target.after(endstr)) {
            System.out.println("迟到了");
        } else {
            System.out.println("没有迟到");
        }
    }

}
