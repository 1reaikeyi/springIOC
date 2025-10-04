package a1set;

public class Two {
    private One one;

    public void setOne(One one) {
        this.one = one;
    }
    public void two(){
        System.out.println("这里是Two类的方法");
        one.one();

    }
}
