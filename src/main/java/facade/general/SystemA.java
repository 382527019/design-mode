package facade.general;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/4
 * Time:15:54
 */
public class SystemA {

    void sysAdo(){
        System.out.println("system <a> start。。。");
        doapi();
    };

    private void doapi(){
        System.out.println("上架");
    }
}
