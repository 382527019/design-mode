package adapter.objadapter;

/**
 * 原角色
 * 被被适配者
 */
public class AdapteeObj {
    public int outputAC220V(){
        int output = 220;
        System.out.print("电压："+output+"V");
        return output;
    }
}
