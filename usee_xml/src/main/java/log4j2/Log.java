package log4j2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Log {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("1bean.xml");
        Logger logger = LoggerFactory.getLogger(Log.class);
    logger.info("这里是一条信息");
    logger.debug("这里是一条调试信息");
    logger.warn("这里是一条警告信息");
    }
}
