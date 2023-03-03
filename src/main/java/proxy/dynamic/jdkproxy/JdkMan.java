package proxy.dynamic.jdkproxy;

import proxy.Iperson;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:11:05
 */
public class JdkMan implements Iperson {

    public JdkMan(){
        System.out.println("My is Man");
    }

    @Override
    public String marriage() {
        System.out.println("赚钱买房");
        return "success";
    }
}
