package org.example.nacos8001;

import n8001.Nacos8001Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import properties.CalendarProperties;

@SpringBootTest(classes = Nacos8001Application.class)
class Nacos8001ApplicationTests {
    @Autowired
    private CalendarProperties calendarProperties;
    @Test
    void contextLoads() {
        System.out.println(calendarProperties.dateFormat);
    }

}
