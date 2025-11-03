package a3constructor;

public class Two {
    private One one;
    private String str;
    public Two(One one, String str) {
        this.one = one;
        this.str = str;
    }
    public void two() {
        one.one();
        System.out.println("one = " + one);
        System.out.println(str);
    }
}
