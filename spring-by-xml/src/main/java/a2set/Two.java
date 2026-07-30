package a2set;

public class Two {
    private One oneType;

    public void setOne(One one) {
        this.oneType = one;
    }
    public void two(){
        System.out.println("这里是Two类的方法");
    }
    public void use(){
        oneType.one();
        two();
    }
}
