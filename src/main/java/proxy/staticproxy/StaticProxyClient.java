package proxy.staticproxy;

import proxy.Iperson;

/**
 *代理端
 */
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
        String marriage = person.marriage();
        System.out.println("结婚后...");
        return marriage;
    }
}
