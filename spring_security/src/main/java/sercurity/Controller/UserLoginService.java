package sercurity.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sercurity.config.UserMapper;
import sercurity.config.UserPojo;

import java.util.List;

@Service
public class UserLoginService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) {
        LambdaQueryWrapper<UserPojo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserPojo::getUsername, username);
        UserPojo userPojo = userMapper.selectOne(queryWrapper);
        if (userPojo == null) {
            throw new RuntimeException("User not found");
        }
        userPojo.setPassword(passwordEncoder.encode(userPojo.getPassword()));
        return userPojo;
    }
}
