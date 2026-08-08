package n8001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import properties.CalendarProperties;

@RestController
public class One {
    @Autowired
    private CalendarProperties calendarProperties;
    @RequestMapping("/one")
    public String one() {
        return calendarProperties.dateFormat;
    }

}
