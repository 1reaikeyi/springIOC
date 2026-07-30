package a3constructor;

public class Two {
    private One one;
    private String str;
    public Two(One one, String str) {
        this.one = one;
        this.str = str;

    }
    public void show(){
        System.out.println("this.one = " + this.one);
        System.out.println("this.str = " + this.str);
    }
}
