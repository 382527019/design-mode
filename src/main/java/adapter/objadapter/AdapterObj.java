package adapter.objadapter;

import adapter.classadapter.AdapteeClass;
import adapter.classadapter.AdapterClass;

/**
 * 适配器
 */
public class AdapterObj implements ITargetObj {

    /*被适配者*/
    private AdapteeObj adapteeObj;
    @Override
    public int outputDC5V() {
        int out = adapteeObj.outputAC220V();
        int outi = out/44;
        System.out.println("输入电流："+out+"V"+"通过适配器-》输出电流："+outi+"V");
        return outi;
    }

    public static void main(String[] args) {
        AdapterClass adapter = new AdapterClass();
        adapter.outputDC5V();
        /*电压：220V输入电流：220V通过适配器-》输出电流：5V*/
    }
}
