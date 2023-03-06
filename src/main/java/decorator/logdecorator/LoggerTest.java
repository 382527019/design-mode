package decorator.logdecorator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/6
 * Time:21:04
 */
public class LoggerTest {
    private  static final Logger log = LoggerFactory.getLogger(LoggerTest.class);
    private  static final Logger jsonLog = JsonLoggerFactory.getLogger(LoggerTest.class);
    public static void main(String[] args) {
        log.info("json");
        jsonLog.info("json");
    }
}
