package time;




import java.text.ParseException;
import java.time.*;

public class Time {
    public static void main(String[] args) throws ParseException {
//        Date d = new Date();
//        System.out.println(d);
//        long time1 = d.getTime()/1000;
//        System.out.println(time1);
//        time1+=3600;
//        Date t2 = new Date(time1);
//        //转化成时间setTime
//        t2.setTime(time1*1000);
//        System.out.println(t2);
//        System.out.println("一小时后"+t2);
//        //1.创建对象
//        Date d1 = new Date();
//        System.out.println(d1);
//        //2.获取时间
//        long time1 = d1.getTime();
//        System.out.println(time1);
////        SimpleDateFormat S1 = new SimpleDateFormat();
//        //3.改写格尺
//        SimpleDateFormat S2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
//        //4.传入数据
//        String s1 = S2.format(d1);
//        System.out.println(s1);
//        System.out.println("=========================");
//        //逆运用
//        String str = "2024-6-7 08:00:00";
//        SimpleDateFormat datestr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = datestr.parse(str);
//        System.out.println("解析后的日期: " + date);
//     =====================================
        //Calender
//        Calendar now = Calendar.getInstance();
//        System.out.println(now);
//        int year = now.get(Calendar.YEAR);
//        int month = now .get(Calendar.MONTH);
//        Date d = new Date();
//        System.out.println(d);
//        now.set(Calendar.MONTH,9);
//        now.add(Calendar.MONTH,1);
//     ======================
        //LocalDate
        //不可变性
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        //年
//        int year = ld.getYear();
//        //月
//        int month = ld.getMonthValue();
//        //日
//        int day = ld.getDayOfMonth();
//        System.out.println(year);
//        System.out.println(month);
//       System.out.println(day);
//        //第？天（一年）
//        int dayOfYear = ld.getDayOfYear();
//        //星期？
//        int dayOfWeek = ld.getDayOfWeek().getValue();
//        // 获取当前日期是一周中的第几天（1 - 7，1 表示周一，7 表示周日）
//        System.out.println("第" + dayOfYear + "天");
//        System.out.println("一周中的第" + dayOfWeek + "天");
//        System.out.println("-------------------");
//        LocalDate ld2 = LocalDate.now();
//        LocalDate ld3 = ld2.withMonth(12);
//        LocalDate ld4 = ld2.withYear(2099);
//        System.out.println("now:"+ld2);
//        System.out.println("月"+ld3);
//        System.out.println("年"+ld4);
//        System.out.println("-----------------");
//        //加plus**
//        LocalDate ld5 = ld2.plusDays(1);
//        LocalDate ld6 = ld2.plusMonths(1);
//        LocalDate ld7 = ld2.plusYears(1);
//        LocalDate ld8 = ld2.plusWeeks(1);
//        System.out.println(ld2);
//        System.out.println("加天"+ld5);
//        System.out.println("加月"+ld6);
//        System.out.println("加年"+ld7);
//        System.out.println("加week"+ld8);
//        System.out.println("------------------");
//        //减minus**
//        LocalDate ld9 = ld2.minusDays(1);
//        LocalDate ld10 = ld2.minusMonths(1);
//        LocalDate ld11 = ld2.minusYears(1);
//        LocalDate ld12 = ld2.minusWeeks(1);
//        LocalDate ld13 = ld2.plus(10,ChronoUnit.YEARS);
//        System.out.println(ld2);
//        System.out.println(ld9);
//        System.out.println(ld10);
//        System.out.println(ld11);
//        System.out.println(ld12);
//        System.out.println(ld13);
//        System.out.println("-------------------");
//        LocalDate ld14 = LocalDate.of(2099,12,31);
//        System.out.println(ld14);
//        //judge
//     System.out.println(ld2.equals(ld10));
//     System.out.println(ld2.isBefore(ld10));
//     System.out.println(ld2.isAfter(ld10));
//     //转LocalDateTime
//     LocalDate ld21 = ld2.atStartOfDay().toLocalDate();
//     System.out.println(ld2);
//     System.out.println(ld21);
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
//     int hour = dt1.getHour();
//     // 获取分钟
//     int minute = dt1.getMinute();
//     // 获取秒
//     int second = dt1.getSecond();
//     // 输出结果
//     System.out.println("当前时间的小时: " + hour);
//     System.out.println("当前时间的分钟: " + minute);
//     System.out.println("当前时间的秒: " + second);
//     //==================================
//     //ZoneId
//     ZoneId z = ZoneId.systemDefault();
//     System.out.println(z.getId());
//     System.out.println(z);
//     //获取世界时区
////     System.out.println(ZoneId.getAvailableZoneIds());
//     //获取**时区时间ZoneID.of
//     ZoneId id = ZoneId.of("America/New_York");
//     ZonedDateTime America = ZonedDateTime.now(id);
//     System.out.println("America = " + America);
//     //时区时间操作
//     ZonedDateTime now = ZonedDateTime.now();
//     System.out.println("now = " + now);
//     //世界时间Clock.systemUTc
//     ZonedDateTime worldnow2 = ZonedDateTime.now(Clock.systemUTC());
//     System.out.println("worldnow2 = " + worldnow2);
        System.out.println("----------------------------------");
        Instant now = Instant.now();
        System.out.println(now);
        long second = now.getEpochSecond();
        System.out.println("second = " + second);
        int nao = now.getNano();
        System.out.println("nao = " + nao);






    }


}
