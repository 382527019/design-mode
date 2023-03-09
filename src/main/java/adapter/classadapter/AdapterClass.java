package adapter.classadapter;

/**
 * 适配器
 */
public class AdapterClass extends AdapteeClass implements ITargetClass {
    @Override
    public int outputDC5V() {
        int out = super.outputAC220V();
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
