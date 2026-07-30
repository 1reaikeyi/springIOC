package 集合map;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();
        m.put("孙悟空",1.0);
        m.put("小明",2.0);
        m.put("小牛",2.0);
        m.put("李华",2.0);
        m.put("小明",1.0);
        System.out.println();
        System.out.println(m);
        System.out.println("m.size() = " + m.size());
        System.out.println(m.get("小明"));
        System.out.println(m.containsKey("小明"));
        System.out.println("m.containsKey() = " + m.containsValue(2.0));
        m.remove("小明");
        System.out.println(m);
        System.out.println("------------------------------------");
//        Collection<String> keys = m.keySet();
//        Collection<Double> values = m.values();
//        System.out.println(keys);
//        System.out.println(values);
        //第一种遍历
//        Collection<String> keys = m.keySet();
//        for (String s : keys) {
//            System.out.println(s+"==============> "+m.get(s));
//        }
////        第二种遍历
//        Set<Map.Entry<String, Double>> entries = m.entrySet();
//        for (Map.Entry<String, Double> entry : entries) {
//            System.out.println(entry.getKey()+"==========>"+entry.getValue());
//        }
//        //第三种遍历
//        m.forEach(new BiConsumer<String, Double>() {
//            @Override
//            public void accept(String s, Double a) {
//                System.out.println(s+"==========>"+a);
//            }
//        });
//        m.forEach((k,v)->{
//            System.out.println(k+"==========>"+v);});



    }
}
