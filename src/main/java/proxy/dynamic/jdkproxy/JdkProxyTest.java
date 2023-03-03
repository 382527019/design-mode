package proxy.dynamic.jdkproxy;

import proxy.Iperson;

import java.lang.reflect.Proxy;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:11:01
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        Iperson person = new JdkProxyClient().clientProxy(new JdkMan());
        person.marriage();

        person = new JdkProxyClient().clientProxy(new JdkWoman());
        person.marriage();
    }
}
