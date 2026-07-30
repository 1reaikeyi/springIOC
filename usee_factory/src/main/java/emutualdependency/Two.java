package emutualdependency;

public class Two {
    private String friend;
    private One one;

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public One getOne() {
        return one;
    }

    public void setOne(One one) {
        this.one = one;
    }

    @Override
    public String toString() {
        return "Two{" +
                "name='" + friend + '\'' +
                ", one=" + one.getFriend()+
                '}';
    }
}
