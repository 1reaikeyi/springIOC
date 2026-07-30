package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    public static void main(String[] args) throws ParseException {
        String star = "2024-6-8 08:00:00";
        String end = "2024-6-8 10:00:00";
        String xiaoming = "2024-6-9 08:10:00";
        String xiaoli = "2024-6-8 08:10:00";
        // 创建 SimpleDateFormat 对象，指定日期格式
        SimpleDateFormat str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date starstr = str.parse(star);
        Date endstr = str.parse(end);
        Date xiaomingstr = str.parse(xiaoming);
        Date xiaolistr = str.parse(xiaoli);
        System.out.println(starstr);
        System.out.println(endstr);
        System.out.println(xiaomingstr);
        System.out.println(xiaolistr);
        // 判断小明是否迟到
        if (xiaomingstr.before(starstr) || xiaomingstr.after(endstr)) {
            System.out.println("小明迟到了");
        } else {
            System.out.println("小明没有迟到");
        }
        if(xiaolistr.before(starstr)||xiaolistr.after(endstr)){
            System.out.println("小李迟到了");
        }else{
            System.out.println("小李没有迟到");
        }
    }

}
