package facade.general;

import lombok.Data;

/**
 * 外观角色 系统对外的统一接口
 */
@Data
public class Facde {
    /** 子系统 ...*/
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
