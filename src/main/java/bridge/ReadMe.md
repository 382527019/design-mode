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

![image](https://user-images.githubusercontent.com/64847551/227131655-b1fce9fa-5cd1-48a6-8872-f43798c106b6.png)
