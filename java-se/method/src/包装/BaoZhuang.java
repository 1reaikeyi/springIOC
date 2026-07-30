package 包装;

//byte------------>Byte     1
//short------------>Short   2
//int------------>Integer   4
//long------------>Long     8
//char------------>Character   2
//float------------>Float      4
//double------------>Double    8
//boolean------------>Boolean  1
//toString === 转字符串
//byte、short、int、long：默认值为 0。
//float、double：默认值为 0.0。
//char：默认值为 '\u0000'（空字符）。
//boolean：默认值为 false。
//引用类型（如 Object、String 等）：默认值为 null。
public class BaoZhuang {

    public static void main(String[] args) {
        //求字节数
//        int sizebyte = Byte.SIZE;
//        int sizebyte2 = Byte.SIZE/8;
//        System.out.println(sizebyte);
//        System.out.println("byte:"+sizebyte2);
//        int sizeint = Integer.SIZE;
//        int sizeint2 = Integer.SIZE/8;//一字节==8比特位
//        System.out.println(sizeint);
//        System.out.println("int:"+sizeint2);
//        int sizechar = Character.SIZE;
//        int sizechar2 = Character.SIZE/8;
//        System.out.println(sizechar);
//        System.out.println("char:"+sizechar2);
//        ========================================
        //包装

//        Integer a1 = Integer.valueOf(2);
//        System.out.println(a1);
        //自动包装
        // Integer a2 =18;
        // System.out.println(a2);
        //自动拆除
//        int a3 = a1;
//        System.out.println(a3);
//        Integer a2 = 2;
//        String s1 = Integer.toString(a2);
//        System.out.println(s1+10);
//        String s2 = a2.toString();
//        System.out.println(s2+10);
//        String s3 = a2+"10";
//        System.out.println(s3+10);
//        ======================
//        String idstr = "10";
//        //只能是整数
        //转换
//        int id = Integer.parseInt(idstr);
//        System.out.println("-------------------------");
//        System.out.println(id+10);
//        String scorestr = "99.5";
//        Double score  = Double.parseDouble(scorestr);
////        Double score  = Double.valueof(scorestr);
//        //                        valueof简化
//        System.out.println(score+0.5);
////        Double scoreWrapper = score;
////        // 输出 scoreWrapper 的实际类型
//        System.out.println(score.getClass().getName());
//        ================================
    }
}
        




















