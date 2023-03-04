package facade.general;

import lombok.Data;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/4
 * Time:15:57
 */
@Data
public class Facde {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    //购物流程
    public void shopping(){
        this.queryASys();
        this.queryBSys();
        this.queryCSys();
    }

    //A系统功能
    public void queryASys(){
        this.systemA.sysAdo();
    }
    //B系统功能
    public void queryBSys(){
        this.systemB.sysBdo();
    }
    //C系统功能
    public void queryCSys(){
        this.systemC.sysCdo();
    }
}
