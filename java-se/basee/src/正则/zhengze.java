package 正则;

public class zhengze {
    public static void main(String[] args) {
        String a1 = "12345678";
        String a2 = "12345678";
        String a3 = "12345678";
        String a4 = "12345678";
        String a5 = "12345678";
        System.out.println(judge(a1));
        System.out.println(judge(a2));
        System.out.println(judge(a3));
        System.out.println(judge(a4));
        System.out.println(judge(a5));
//        String regex1 = "1[3-9]\\d{9}";
//        String regex2 = "1[3-9]\\d{0,9}";
//
//        String[] testStrings = {"13", "13800138000", "13800"};
//
//        for (String test : testStrings) {
//            System.out.println("测试字符串: " + test);
//            System.out.println("正则表达式 1[3-9]\\d{9} 匹配结果: " + Pattern.matches(regex1, test));
//            System.out.println("正则表达式 1[3-9]\\d{0,9} 匹配结果: " + Pattern.matches(regex2, test));
//            System.out.println();}
    }
    public static boolean judge(String s){
//        return  s.matches("^[1]//d{1,9}$");
        return s.matches("^1\\d{1,9}$");
    }
}
