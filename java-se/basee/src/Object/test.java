package Object;

import java.util.Arrays;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建 list 对象 l1，传递姓名、年龄和成绩数组
        list l1 = new list("Tom", 20, new double[]{90, 99});
        System.out.println(l1);
        // 创建 list 对象 l2，传递相同的姓名、年龄和成绩数组
        list l2 = new list("Tom", 20, new double[]{90, 99});
        System.out.println(l2);
        System.out.println("equals:"+l1.equals(l2));
        System.out.println();

        list l22 = (list) l2.clone();
        System.out.println(l22.getName());
        System.out.println(l22.getId());
        System.out.println(Arrays.toString(l22.getScore()));
        System.out.println(l22.getScore());
    }
}
