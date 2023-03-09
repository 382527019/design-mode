package adapter.classadapter;

/**
 * 原角色
 * 被被适配者
 */
public class AdapteeClass {
    public int outputAC220V(){
        int output = 220;
        System.out.print("电压："+output+"V");
        return output;
    }
}
