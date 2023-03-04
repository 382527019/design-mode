package proxy.general;

import lombok.Data;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:18:25
 */
@Data
public class GeneralProxy {

    private Iserver server = new IserverImpl();

    public void handlerProxy(){
        String before = before();
        System.out.println(before);

        String action = server.action();
        System.out.println(action);

        String after = after();
        System.out.println(after);
    }

    private String before(){
        return "Proxy brefore do something";
    }


    private String after(){
        return "Proxy after do something";
    }
}
