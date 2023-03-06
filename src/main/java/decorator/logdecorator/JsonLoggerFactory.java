package decorator.logdecorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JsonLoggerFactory  {

    static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);

    }
}
