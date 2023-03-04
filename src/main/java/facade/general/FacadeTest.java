package facade.general;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/4
 * Time:15:53
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facde facde = new Facde();
        facde.queryASys();
        facde.queryBSys();
        facde.queryCSys();
        System.out.println("============");
        //集成子系统功能提供顶级访问
        facde.shopping();
        /* output
                * system <a> start。。。
        上架
        system <b> start。。。
        购买
        system <c> start。。。
        发货
        ============
        system <a> start。。。
        上架
        system <b> start。。。
        购买
        system <c> start。。。
        发货
        *
        * */
    }
}
