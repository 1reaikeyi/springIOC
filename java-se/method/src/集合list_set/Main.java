package 集合list_set;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {


        List<String> l2 = new ArrayList<>();
        LinkedList<String> list1 = new LinkedList<>();
        ArrayList<String> list2 = new ArrayList<>();


        l2.add("鲁智深");
        l2.add("林黛玉");
        l2.add("牛魔王");
        for (String s : l2) {
            System.out.println(s);
        }
        l2.set(2, "猴子");
        Iterator<String> ll = l2.iterator();
        while (ll.hasNext()) {
            System.out.println(ll.next());
        }
        l2.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });
//      简化1
//        l2.forEach((String s)-> System.out.println(s));


    }
}
