package emutualdependency;

public class One {
    private String friend;
    private Two two;

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public Two getTwo() {
        return two;
    }

    public void setTwo(Two two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + friend + '\'' +
                ", two=" + two.getFriend() +
                '}';
    }
}
