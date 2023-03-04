# 门面模式
外观模式，提供一个统一的接口用来访问子系统
提高子系统独立性
隔离客户端与子系统直接交互，预防代码污染

* 提供一个门面调用各个子系统功能
~~~
public class Facde {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

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
~~~