package bridge.message;

/**
 * 发送方式和紧急程度 = 》桥接
 */
public  abstract class MessageBridge {

    private IMessage message;

    public MessageBridge(IMessage message) {
        this.message = message;
    }

    void send(String name, String context){
        this.message.send(name,context);
    }

}
