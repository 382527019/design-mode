# 桥接模式

* 把多个维度通过桥梁桥接起来
* eg：用不同方式发送不同急迫等级的通知
~~~
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
~~~

![image](https://user-images.githubusercontent.com/64847551/227131655-b1fce9fa-5cd1-48a6-8872-f43798c106b6.png)

~~~java
public class BridgeTest {

    public static void main(String[] args) {
        IMessage emailMessage = new EmailMessage();
        IMessage smsMessage = new SmsMessage();
        OrdinaryLevel ordinaryLevel = new OrdinaryLevel(smsMessage);
        UrgentLevel urgentLevel = new UrgentLevel(emailMessage);
        ordinaryLevel.send("admin","send context。。。");
        urgentLevel.send("admin321","send context。。。");
    }
}
~~~