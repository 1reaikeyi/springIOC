package Stringg;

//包名一般采用小写字母，以点号分隔，通常是公司域名的倒序，像 com.example.stringutils 这样。
//类名要遵循大驼峰命名法，也就是每个单词的首字母大写，其他字母小写
public class StringObject {
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//    public boolean equals(Object anObject) {
//        if (this == anObject) {
//            return true;
//        }
//        return (anObject instanceof String aString)
//                && (!COMPACT_STRINGS || this.coder == aString.coder)
//                && StringLatin1.equals(value, aString.value);
//    }

    public static void main(String[] args) {
//       String是无法改变的，使用新集合接收
//       // 定义
        //第一种
//       String name ="hello";
//        System.out.println(name);

//        //第二种
//        String r = new String("hello");  // 2对象
//        System.out.println(r);
//        //第三种
//        char[] chars={'h','a'};
//        String r2 = new String(chars);
//        System.out.println(r2);
//        //第四种
//        byte[] bytes={'t','i'};
//        String r3 = new String(bytes);
//        //第五种
//        ========================================================
//        长度lrngth
//        String m = "小米xiaomizhou";
//        System.out.println(m.length());
//        判断相等equals
//        String m = "niumo";
//        String n = "niumo";
//        System.out.println(m.equals(n));
//        //忽略大小写equalsIgoreCase
//        //把全小写的变成大写ctrl+shift+u
//        String m1 = "NIUMO";
//        System.out.println("m.equalsIgnoreCase(m1) = " + m.equalsIgnoreCase(m1));
//        //截取subString,（包前不报后(两个变量），（一个变量）到结尾）需要新标量char接收
//        String m = "小米xiaomizhou";
//        System.out.println("m.substring(0,8) = " + m.substring(0, 8));
//        System.out.println("m.substring(2) = " + m.substring(2));

        //替换replace
//       String work = "孙悟空,猪八戒,沙和尚";
//       String work2 = work.replace("沙和尚","唐僧");
//        System.out.println("work = " + work);
//        System.out.println("work.replase = " + work2);
//        //是否包括指定内容contains
//        System.out.println(work.contains("孙"));
//        //判断开头startsWith
//        System.out.println(work.startsWith("孙"));
//        System.out.println(work.startsWith("孙悟空"));
//        //分割split需要数组接收
//        String w = "xiaomi,xiaoming,xiaohua";
//        String[] w1 = w.split(",");
//        for (int i = 0; i < w1.length; i++) {
//            System.out.println(w1[i]);
//        }
//        //charAt获取
//        System.out.println("work.charAt(1) = " + work.charAt(1));
//        //装成数组toSharArray
//        char[] ch = work.toCharArray();
//        for (int i = 0; i <ch.length; i++) {
//            System.out.println(ch[i]);
//        }

//        format(String format, Object... args)：格式化字符串
//        问题：生成一份包含用户信息的报告，将用户的姓名、年龄、职业等信息格式化为特定的文本。
//        String name = "Alice";
//        int age = 25;
//        String occupation = "Engineer";
//        String report = String.format("姓名: %s\n年龄: %d\n职业: %s", name, age, occupation);
//        System.out.println(report);

//        去除首尾空白后的用户名是
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入用户名: ");
//        String username = scanner.nextLine();
//        String trimmedUsername = username.trim();
//        System.out.println("去除首尾空白后的用户名是: " + trimmedUsername);



    }
}
