package proxy.staticproxy;

import proxy.Iperson;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:10:39
 */
public class Man implements Iperson {

    public Man(){
        System.out.println("My is Man");
    }

    @Override
    public String marriage() {
        System.out.println("赚钱买房");
        return null;
    }
}
