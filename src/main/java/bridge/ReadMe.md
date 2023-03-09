# 桥接模式

* 把多个维度通过桥梁桥接起来

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

![image](https://user-images.githubusercontent.com/64847551/223991509-516a9c9d-29d4-4226-aa19-96f7f6750a09.png)
