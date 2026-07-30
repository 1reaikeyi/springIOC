package springboot.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class SomeEnviroment {
    @Autowired
    private Environment env;

   public void deSome() {
       String[] activeProfiles = env.getActiveProfiles();
       for (String activeProfile : activeProfiles) {
           System.out.println(activeProfile);
       }
       String profile = env.getProperty("user.id");
       System.out.println(profile);
   }
}
