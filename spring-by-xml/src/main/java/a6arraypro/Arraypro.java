package a6arraypro;

import java.util.*;

public class Arraypro {
//    list
    private ArrayList<String> name;

    public void setName(ArrayList<String> list) {
        this.name = list;
    }

    public void print1() {
        for(String str : name) {
            System.out.print(str+"\t");
        }
    }
//    set
    private HashSet<String> phone;

    public void setPhone(HashSet<String> phone) {
        this.phone = phone;
    }

    public void print2() {
        for(String str : phone) {
            System.out.print(str+"\t");
        }
    }
//    map
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

}
