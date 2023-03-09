package bridge.message;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:17:50
 */
public class UrgentLevel extends MessageBridge {

    public UrgentLevel(IMessage message) {
        super(message);
    }

    void send(String name ,String context){
        System.out.print("[加急]");
        super.send(name,context);
    }
}
