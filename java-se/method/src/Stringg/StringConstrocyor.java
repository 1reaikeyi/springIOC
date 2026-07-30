package Stringg;

import java.util.StringJoiner;

public class StringConstrocyor {


    public static void main(String[] args) {
//       // StringBuilder ==StringBuffer
//        StringBuilder b1 = new StringBuilder();
////      //  StringBuffer
//        //添加append
//        b1.append("java");
//        b1.append("hehe");
//        b1.append("hehe");
//        b1.append("hehe00000000000000000000000000000");
//
//        System.out.println(b1);
//        //长度length
//        int b = b1.length();
//        int b2 = b1.capacity();
//        System.out.println(b2);
//        System.out.println(b);
        StringBuilder b1 = new StringBuilder();
        System.out.println("初始容量: " + b1.capacity());
//        b1.append(false);
//        System.out.println("b1.length() = " + b1.length());
//        System.out.println("追加 \"false\" 后的容量: " + b1.capacity());
//        System.out.println("----------------------");
        b1.append(new Object());
//        System.out.println("追加 \"Object\" 后的容量: " + b1.capacity());
//        System.out.println("b1.length() = " + b1.length());
//        System.out.println("----------------------");
//
//        System.out.println("----------------------");
        b1.append(new int[1]);
        System.out.println("追加 \"int[1]\" 后的容量: " + b1.capacity());
        System.out.println("b1.length() = " + b1.length());
        System.out.println("----------------------");


        //反转reverse
        b1.reverse();
        System.out.println(b1);
        String s1 = b1.toString();
        System.out.println(s1);
//        b1.delete();

        StringJoiner j1 = new StringJoiner(",","[","]");
        for (int i = 0; i < 3; i++) {
            j1.add("StringJoiner"+i);
        }
        System.out.println(j1);
//        *******************
//        StringBuilder sb = new StringBuilder("20250310");
//        // 在索引 4 和 6 处插入分隔符 -
//        sb.insert(4, "-");
//        sb.insert(7, "-");
//        System.out.println(sb); // 输出: 2025-03-10
//        StringBuilder sb = new StringBuilder("  Hello  World  ");
//        int start = 0;
//        int end = sb.length();
//        // 找到开头非空格的位置
//        while (start < end && sb.charAt(start) == ' ') {
//            start++;
//        }
//        // 找到结尾非空格的位置
//        while (end > start && sb.charAt(end - 1) == ' ') {
//            end--;
//        }
//        // 删除首尾空格
//        sb.delete(end, sb.length());
//        sb.delete(0, start);
//        System.out.println(sb); // 输出: Hello  World
//        StringBuilder sb = new StringBuilder("I like apples, apples are delicious.");
//        String oldStr = "apples";
//        String newStr = "oranges";
//        int index = sb.indexOf(oldStr);
//        while (index != -1) {
//            sb.replace(index, index + oldStr.length(), newStr);
//            index = sb.indexOf(oldStr, index + newStr.length());
//        }
//        System.out.println(sb);
//        // 输出: I like oranges, oranges are delicious.
//        StringBuilder sb = new StringBuilder("This is a long sentence for testing substring.");
//        int start = sb.indexOf("long");
//        int end = sb.indexOf("for");
//        String sub = sb.substring(start, end - 1);
//        System.out.println(sub); // 输出: long sentence
//        StringJoiner sj = new StringJoiner(", ", "List: ", ".");
//        sj.setEmptyValue("List: No products available.");
//        System.out.println(sj); // 输出: List: No products available.
//        StringJoiner sj1 = new StringJoiner(", ", "[", "]");
//        sj1.add("Alice").add("Bob");
//
//        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
//        sj2.add("Charlie").add("David");
//
//        sj1.merge(sj2);
//        System.out.println(sj1); // 输出: [Alice, Bob, Charlie, David]

    }

}
