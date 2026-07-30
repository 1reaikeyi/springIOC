package math;

import java.math.RoundingMode;

public class BigDecimal {
    public static void main(String[] args) {
        //小数计算
        double a=0.10000,b=0.50000;
        double c = a+b;
        System.out.println(c);
        System.out.println("-------------");
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal a2 = new BigDecimal(Double.toString(b));
        java.math.BigDecimal a1 = java.math.BigDecimal.valueOf(a);
        java.math.BigDecimal a2 = java.math.BigDecimal.valueOf(b);
        java.math.BigDecimal c1 = a1.add(a2);
        java.math.BigDecimal c2 = a1.divide(a2,2, RoundingMode.CEILING);
        java.math.BigDecimal c3 = a1.multiply(a2);
        java.math.BigDecimal c4 = a1.subtract(a2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        double d = c2.doubleValue();
        System.out.println(d);
    }
}
