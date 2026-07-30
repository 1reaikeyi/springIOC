package Stringg;

public class 加 {

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        System.out.println("s1==s2 = " + (s1==s2));
        String s3 = s1+s2;
        String s4 ="123123";
        String s5 = "123"+"123";
        System.out.println("(s3==s4) = " + (s3==s4));
        System.out.println("s4==s5 = " + (s4==s5));
        System.out.println("s3==s5 = " + (s3==s5));
        String s6 = "123"+s1;
        System.out.println("(s6==s4) = " + (s6==s4));
        System.out.println("(s6==s3) = " + (s6==s3));
        System.out.println("(s6==s5) = " + (s6==s5));

    }
}
