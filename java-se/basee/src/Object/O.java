package Object;

import java.util.Objects;

public class O {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = null;
        System.out.println("Objects.equals(s1, s2)"+Objects.equals(s1, s2));
        System.out.println("Objects.isNull(s1)"+Objects.isNull(s1));
        System.out.println("Objects.isNull(s1)"+Objects.isNull(s2));
        System.out.println("Objects.isNull(s1)"+Objects.nonNull(s1));
        System.out.println("Objects.isNull(s1)"+Objects.nonNull(s2));
    }
}
