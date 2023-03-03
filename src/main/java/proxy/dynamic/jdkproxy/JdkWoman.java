package proxy.dynamic.jdkproxy;

import proxy.Iperson;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:11:05
 */
public class JdkWoman implements Iperson {

    public JdkWoman(){
        System.out.println("My is Woman");
    }

    @Override
    public String marriage() {
        System.out.println("相夫教子");
        return "success";
    }
}
