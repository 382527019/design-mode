package proxy.staticproxy;

import proxy.Iperson;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:10:40
 */
public class Woman implements Iperson {

    public Woman(){
        System.out.println("My is woman");
    }
    @Override
    public String marriage() {
        System.out.println("准备生儿育女");
        return null;
    }
}
