package a8properties;

public class JDBC {
 private String driver;
 private String url;
 private String user;
 private String password;

    @Override
    public String toString() {
        return "JDBC{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String username) {
        this.user = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
