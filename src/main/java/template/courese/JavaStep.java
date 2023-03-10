package template.courese;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 模板
 */
public class JavaStep extends TemplateStep {

    /*钩子函数重写*/
    @Override
    protected void hookPay() {
        System.out.println("缴费：7w[Java]");
    }



    /*---固定步骤*/

    @Override
    protected void practice() {
        System.out.println("课前预习[Java]");
    }

    @Override
    protected void notes() {
        System.out.println("上课做笔记[Java]");

    }

    @Override
    protected void prepare() {
        System.out.println("课后练习[Java]");
    }


}
