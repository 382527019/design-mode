package proxy.staticproxy;

/**
 * 静态代理测试
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        //        Woman start proxy
        StaticProxyClient staticProxyClient = new StaticProxyClient(new Woman());
        staticProxyClient.startProxy();

        //        man start proxy
        staticProxyClient = new StaticProxyClient(new Man());
        staticProxyClient.startProxy();

    }
}
