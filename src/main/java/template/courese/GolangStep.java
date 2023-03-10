package template.courese;

/**
 * 模板
 */
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
