package a10factory;

public class GunFactory extends Factory {
    @Override
    public Ku get() {
        return new Gun();
    }
}
