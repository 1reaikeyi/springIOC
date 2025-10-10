import afactory.*;

public class Testku {
//    1
//    public static void main(String[] args) {

//        Ku gun = Factory.getKu("Gun");
//        gun.print();
//        Ku tank = Factory.getKu("Tank");
//        tank.print();
//        Ku truck = Factory.getKu("Ku");
//        truck.print();
//
//    }
//    2
    public static void main(String[] args) {
        //通过工厂类获得Gun对象
      Factory gun = new GunFactory();
      Ku gun1 = gun.get();
      gun1.print();
      Factory tank = new TankFactory();
      Ku tank1 = tank.get();
      tank1.print();
    }
}
