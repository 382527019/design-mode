package template.courese;

/**
 * 1.模板
 */
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
