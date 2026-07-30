package 泛型;

public class CarTest {
    public static <T extends Car > void car(T param) {
    System.out.println("传入的参数类型是: " + param.getClass().getName());
}
    public static void main(String[] args) {
        car(new xiaomi());
        car(new wuling());
    }
}
