package decorator.logdecorator;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

/**
 * 具体对象
 */
public class JsonLogger extends DecoratorLogger {
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void debug(String s) {
        JSONObject jsonObject = toJson();
        jsonObject.put("msg", s);
        logger.info(jsonObject.toString());
    }

    @Override
    public void info(String s) {
        JSONObject jsonObject = toJson();
        jsonObject.put("msg", s);
        logger.info(jsonObject.toString());
    }

    @Override
    public void warn(String s) {
        JSONObject jsonObject = toJson();
        jsonObject.put("msg", s);
        logger.warn(jsonObject.toString());
    }

    @Override
    public void error(String s) {
        JSONObject jsonObject = toJson();
        jsonObject.put("msg", s);
        logger.error(jsonObject.toString());
    }

    private JSONObject toJson(){
       return new JSONObject();
    }


}
