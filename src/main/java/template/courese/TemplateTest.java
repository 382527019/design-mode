package template.courese;

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
