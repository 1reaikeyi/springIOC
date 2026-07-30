package json.config;

public class User {
    private String username;
    private String id;
    public User(String username, String id) {
        this.username = username;
        this.id = id;
        System.out.println("使用有参构造");
    }

    public User() {
        System.out.println("使用无参构造");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String password) {
        this.id = password;
    }

    @Override
    public String toString() {
        return "request.config.User{" +
                "username='" + username + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
