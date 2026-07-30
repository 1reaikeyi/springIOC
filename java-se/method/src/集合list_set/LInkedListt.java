package 集合list_set;

import java.util.LinkedList;

public class LInkedListt {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");list.add("c");
        list.addLast("最后一个");
        list.addFirst("第一个");
        System.out.println(list);
        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println("list = " + list);
        System.out.println(list.removeLast());
        System.out.println("list = " + list);
    }
}
