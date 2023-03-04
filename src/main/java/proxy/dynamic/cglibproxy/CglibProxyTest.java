package proxy.dynamic.cglibproxy;

import proxy.staticproxy.Man;
import proxy.staticproxy.Woman;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/4
 * Time:14:24
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        Man man = (Man)new CglibproxyClient().getInstance(Man.class);
        man.marriage();
        Woman woman = (Woman)new CglibproxyClient().getInstance(Woman.class);
        woman.marriage();
    }
}
