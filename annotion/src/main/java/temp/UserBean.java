package temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("temp")
@Component
public class UserBean {
    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;
    public String getUser() {
        return userRepository.findUser();
    }

}
