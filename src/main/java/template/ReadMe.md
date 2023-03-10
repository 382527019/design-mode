# 模板方法
* 定义算法的骨架,并允许子类为其中的多个步骤提供实现


定义固定模板

~~~
public abstract class TemplateStep {

    /*钩子*/
    private boolean free = false;

    /*实现步骤*/
    public void step() {
        //钩子
        if (hookFree()) {
            hookPay();
        }
        /*1.课前预习 */
        prepare();
        /*2.上课做笔记*/
        notes();
        /*3.课后练习*/
        practice();
    }

    protected abstract void hookPay();

    /*触发钩子函数方式*/
    protected  boolean hookFree(){
        return this.free;
    }

    protected abstract void practice();

    protected abstract void notes();

    protected abstract void prepare();

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
~~~

* 实现类继承模板实现抽象方法
~~~
public class GolangStep extends TemplateStep {

    /*钩子函数重写*/
    @Override
    protected void hookPay() {
        System.out.println("缴费：10w[Golang]");
    }
    
    /*---固定步骤*/

    @Override
    protected void practice() {
        System.out.println("课前预习[Golang]");
    }

    @Override
    protected void notes() {
        System.out.println("上课做笔记[Golang]");
    }

    @Override
    protected void prepare() {
        System.out.println("课后练习[Golang]");
    }

}
~~~

* 调用
~~~
public class TemplateTest {
    public static void main(String[] args) {
        TemplateStep javaStep = new JavaStep();
        javaStep.setFree(true);//触发钩子
        javaStep.step();
        System.out.println("=======");
        TemplateStep golangStep = new GolangStep();
        golangStep.setFree(true);//触发钩子
        golangStep.step();
        /*缴费：7w[Java]
        课后练习[Java]
        上课做笔记[Java]
        课前预习[Java]
        =======
        缴费：10w[Golang]
        课后练习[Golang]
        上课做笔记[Golang]
        课前预习[Golang]
        */
    }
}
~~~
