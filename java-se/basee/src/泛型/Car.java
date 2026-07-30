package 泛型;


public class Car {
    public void run(){
        System.out.println("跑");
    }

}
class xiaomi extends Car{
    @Override
    public  void run() {
        System.out.println("xiaomi跑");
    }

}
class wuling extends Car{
    @Override
    public void run() {
        System.out.println("wuling跑");
    }
}

