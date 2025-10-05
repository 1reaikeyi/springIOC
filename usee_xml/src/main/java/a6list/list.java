package a6list;

import java.util.*;

public class list {
    private ArrayList<String> name;

    public void setName(ArrayList<String> list) {
        this.name = list;
    }

    public void print() {
//        Object[] a = list.toArray();
//        System.out.println("list = " + Arrays.toString(a));
        for(String str : name) {
            System.out.print(str+"\t");
        }
    }
    private HashSet<String> phone;
    public void setPhone(HashSet<String> phone) {
        this.phone = phone;
    }
    public void print2() {
        for(String str : phone) {
            System.out.print(str+"\t");
        }
    }
    private Map<String, String> eat;
    public void setEat(Map<String, String> eat) {
        this.eat = eat;
    }
    public void print3() {
        Set<Map.Entry<String, String>> entrySet = eat.entrySet();
        for(Map.Entry<String, String> entry : entrySet) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
    private Properties properties;
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    public void print4() {
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
        for(Map.Entry<Object, Object> entry : entrySet) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
