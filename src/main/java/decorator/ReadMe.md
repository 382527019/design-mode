# 装饰器模式
#####1.通用
##### Component -抽象组件，被装饰对象
* 抽象类|接口 ->规定被装饰对象的行为
##### ConcreateCompoent -被装饰器对象
* 被装饰对象的具体实现
##### Decorator -抽象装饰器
* 装饰CncreateCompoent的装饰器，内部有Component对象指向。
* 让Decorator子类实现强制指定构造方式
    ~~~
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
  ~~~
  
