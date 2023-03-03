package proxy.dynamic.jdkproxy;

import proxy.Iperson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.zip.Inflater;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:10:58
 */
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
