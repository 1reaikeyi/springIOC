package a9one;

public class One {
    public void print(){
        System.out.println("this = " + this);
        System.out.println("这里是One类的方法");
    }

    public One() {
        System.out.println("public One = " + this);
    }
}
