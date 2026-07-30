package bean;

public class Server {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void insert(){
        userDao.insert();
    }
}
