package bean;

public class Server {
    private Dao userDao;


    public void setDao(Dao dao) {
        this.userDao = dao;
    }

    public void save(){
        userDao.insert();
    }
}
