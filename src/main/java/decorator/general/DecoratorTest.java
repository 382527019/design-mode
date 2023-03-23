package decorator.general;

public class DecoratorTest {
    public static void main(String[] args) {
        //加载装饰器
        //        原具体装饰器
        Component component = new ConcreateCompoent();
        component.operation();
        /*装饰器load...扩展功能处理能力*/

        //-----Decorator装饰器
        ConcreateCompoentA concreateCompoentA = new ConcreateCompoentA(component);
        concreateCompoentA.operation();
        /*
        *   A before-装饰器load... A能力
            decorator befor do ....
            装饰器load...扩展功能处理能力
            decorator after do ....
            A after-装饰器load... A能力
        * */
        ConcreateCompoentB concreateCompoentB = new ConcreateCompoentB(component);
        concreateCompoentB.operation();
        /*
        B before-装饰器load... B能力
        decorator befor do ....
        装饰器load...扩展功能处理能力
        decorator after do ....
        B after-装饰器load... B能力
        */
        ConcreateCompoentB concreateCompoentAB = new ConcreateCompoentB(concreateCompoentA);
        concreateCompoentAB.operation();
        /*
        B before-装饰器load... B能力
        decorator befor do ....
        A before-装饰器load... A能力
        decorator befor do ....
        装饰器load...扩展功能处理能力
        decorator after do ....
        A after-装饰器load... A能力
        decorator after do ....
        B after-装饰器load... B能力
        */
    }
}
