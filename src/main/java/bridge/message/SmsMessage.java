package bridge.message;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:17:46
 */
public class SmsMessage implements IMessage {
    @Override
    public void send(String name, String context) {
        System.out.println("[短信]接收人："+name + "内容"+context);
    }
}
