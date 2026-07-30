package Stringg;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //1---Arrays.toString() // 打印转换后的字符串
        int[] arr={11,22,33,44,55,66,77,88};
        String result = Arrays.toString(arr);
        System.out.println(result);
        //2---Arrays.aslist() // 把数组转换成集合
        //注意事项：
        //1. 集合的长度是固定的，不能添加和删除元素
        //2. 如果数组中的元素是引用类型，集合中的元素就是引用类型
        //3. 如果数组中的元素是基本类型，集合中的元素就是基本类型的包装类
        //4. 集合中的元素不能是基本类型，只能是引用类型
        //5. 集合中的元素不能是null
        //3----Arrays.copyOfRange() // 截取数组
//        int[] s2 = Arrays.copyOfRange(arr,0,2);
//        for (int i=0;i< s2.length;i++) {
//            System.out.println(s2[i]);
//        }
        //4-----填充
        //Arrays.fill(arr,10);
    }
}
