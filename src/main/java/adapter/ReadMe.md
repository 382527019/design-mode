# 适配器模式

把客户端要服务的Itarget目标场景通过**Adapter**适配上不兼容的Adaptee原场景。

* 类适配器
让Adapter实现Itarget接口和继承Adaptee，在Adapter中将两者特性转化
~~~
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
~~~

* 对象适配器
在适配器中组合被适配者
~~~
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
~~~

* 接口适配器