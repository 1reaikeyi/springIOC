package 集合list_set;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {
   public static void main(String[] args) {
      ArrayList<String> list  = new ArrayList<String>();
      //添加add
//        list.add("java");
//        list.add("+");
//        list.add("AI");
//        System.out.println(list);
      //定向加入
//        list.add(3,"java");
//        System.out.println(list);
      //删除
//        list.remove(3);
//        System.out.println(list);

//        list.remove("java");
//        System.out.println(list);
//
//        //索引
//        String s = list.get(1);
//        System.out.println(s);

//        //长度size
//        System.out.println(list.size());
      //修改set
      list.add("Java");
      list.add("Python");
      list.add("C++");
      String oldValue = list.set(1, "JavaScript");
      System.out.println("被替换的旧元素: " + oldValue);
      System.out.println("修改后的列表: " + list);
      //截取subList
      List<String> subList = list.subList(1, 3);
      System.out.println("子列表: " + subList);
      //加入
      ArrayList<String> list2 = new ArrayList<>();


   }
}
