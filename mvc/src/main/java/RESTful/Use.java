package RESTful;

public class Use {
    public String username; // 保持属性名统一
    public int id;
    public Use() {
    }
    public Use(String username, int id) {
        this.username = username;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Use{" +
                "username='" + username + '\'' + // 这里改为 username
                ", id=" + id +
                '}';
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }


}