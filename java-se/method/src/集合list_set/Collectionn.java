package 集合list_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collectionn {
    public static void main(String[] args) {

//        *************************************
//        add(E e)：向集合中添加一个元素。
//        remove(Object o)：从集合中移除指定的元素。
//        contains(Object o)：检查集合中是否包含指定的元素。
//        size()：返回集合中元素的数量。
//        isEmpty()：检查集合是否为空。
//        clear()：移除集合中的所有元素。
//        iterator()：返回一个用于遍历集合的迭代器。
//        **************************************
                Collection<String> c =new ArrayList<>();
//        加入add
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java3");
//        System.out.println("c.add"+c);
        //清空clear
////        c.clear();
//        System.out.println("c = " + c);
        //长度lenth
//        System.out.println(c.size());
        //包含contains
//        System.out.println(c.contains("java1"));
//        //错误，没有remove（int）
////        boolean result = c.remove(0);
////        System.out.println(result);
////        System.out.println(c);
//        System.out.println(c.remove("java2"));
//        //转字符串
//        Object[] str =  c.toArray();
//        System.out.println(Arrays.toString(str));
//        String str2 = Arrays.toString(c.toArray(new String[c.size()]));
//        System.out.println("str2 = " + str2);
//        System.out.println("-------------");
//        把先前的加入addAll（new ArrayList<>）
        Collection<String> c2 = new ArrayList<>();
        c2.add("小明");
        c2.addAll(c);
        System.out.println("c2 = " + c2);
        //迭代Tterator
//        Iterator<String> in = c2.iterator();
//        System.out.println(in.next());
//        System.out.println(in.next());
//        System.out.println(in.next());

//        while(in.hasNext()){
//            System.out.println(in.next());
//        }
//        for(String s:c2){
//            System.out.println("c2 = " + c2);
//        }

        double[] price ={100,90,80,70};

         Arrays.setAll(price, (int value)-> {
                 return price[value]*0.8;
         });
        System.out.println(Arrays.toString(price));
        Arrays.sort(price);
        System.out.println(Arrays.toString(price));




    }
}
