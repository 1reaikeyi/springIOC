package pojo;

public class UserServer {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void insert(){
        System.out.println("service正在insert");
        userMapper.insert();
    }
}
