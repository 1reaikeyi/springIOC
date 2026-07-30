package afactory;

public class TankFactory extends Factory{
    @Override
    public Ku get() {
            return new Tank();
    }
}
