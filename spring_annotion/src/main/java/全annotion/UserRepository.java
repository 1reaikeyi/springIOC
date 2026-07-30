package 全annotion;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String findUser(){
        return "Tom";
    }
}
