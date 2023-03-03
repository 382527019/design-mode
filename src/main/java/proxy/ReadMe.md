#代理模式
为其他对象提供代理，控制对这个对象的访问
扩展代理前、后的额外功能
~~~
GeneralProxy generalProxy = new GeneralProxy();
        generalProxy.handlerProxy();
        /*
       Proxy brefore do something
        action....
       Proxy after do something
        */
~~~
## 动态
* JDK动态代理
  * Proxy.newProxyInstance
  * 实现InvocationHandler接口
~~~
public class JdkProxyClient implements InvocationHandler {

    private Iperson person;


    //代理客户端
    public Iperson clientProxy(Iperson person){
        this.person = person;
        return (Iperson)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), this);
    }

    /** 实现InvocationHandler 重写invoke方法*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk.. start proxy");
        Object invoke = method.invoke(this.person, args);
        System.out.println("jdk.. end proxy");
        return invoke;
    }
}
~~~
## 静态
* 显示声明被代理对象
~~~
public class StaticProxyClient {

    private Iperson person;

    public StaticProxyClient(Iperson person){
        this.person = person;
    }

    /**
     * 代理实现
     * @return
     */
    public String startProxy() {
        System.out.println("结婚前...");
        person.marriage();
        System.out.println("结婚后...");
        return null;
    }
    
    public static void main(String[] args) {
        //        Woman start proxy
        StaticProxyClient staticProxyClient = new StaticProxyClient(new Woman());
        staticProxyClient.startProxy();

        //        Woman start proxy
        staticProxyClient = new StaticProxyClient(new Man());
        staticProxyClient.startProxy();

    }
}
~~~
### GGLib

### JDK Proxy
