package a2set;

public class Two {
    private One one;

    public void setOne(One one) {
        this.one = one;
    }
    public void setOne1(One one) {
        this.one = one;
    }
    public void two(){
        System.out.println("这里是Two类的方法");
        one.one();

    }
}
