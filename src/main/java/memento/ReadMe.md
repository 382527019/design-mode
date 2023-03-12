# 备忘录模式
* 保存快照备份
* 有后悔，可回退版本
![image](https://user-images.githubusercontent.com/64847551/224550386-6d579445-fe35-45d8-b96a-d40d695ed63a.png)

---

* 管理者
  * 对版本进行存储管理 add存储|remove删除版本
~~~
public class Caretaker {
    private final Stack<Memento> stack = new Stack<>();

    public void addMemento(Memento memento){
        stack.push(memento);
    }

    public Memento removeMemento(){
        return stack.pop();
    }

    public void print(){
        for (Memento memento : stack) {
            System.out.println(memento.toString());
        }

    }
}
~~~

* 创建者
  * 创建备份
  * 退回版本
~~~
public class Originator {
    private String context;

    public Originator(String context) {
        this.context = context;
    }

    /*设置备份*/
    public Memento setMemento() {
        return new Memento(this.context);
    }

    /*撤回备份*/
    public void recall(Memento memento){
        this.context = memento.getContext();
    }


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
~~~

* 备忘录
~~~
public class Memento {
    private String context;

    public Memento(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "context='" + context + '\'' +
                '}';
    }
}
~~
* 使用
  * 备份后撤回版本
    * `memento = caretaker.removeMemento();
      originator.recall(memento);`
~~~
public class MementoTest {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator("第1个内容修改");
        //备份
        Memento memento = originator.setMemento();
        caretaker.addMemento(memento);

        originator = new Originator("第2个内容修改");

        //备份
        memento = originator.setMemento();
        caretaker.addMemento(memento);
        originator = new Originator("第3个内容修改");

        //备份
        memento = originator.setMemento();
        caretaker.addMemento(memento);
        caretaker.print();

        System.out.println("撤销1");
        memento = caretaker.removeMemento();
        originator.recall(memento);
        caretaker.print();
        System.out.println(originator.getContext());

        System.out.println("撤销2");
        memento = caretaker.removeMemento();
        originator.recall(memento);
        caretaker.print();
        System.out.println(originator.getContext());

        System.out.println("撤销3");
        memento = caretaker.removeMemento();
        originator.recall(memento);
        caretaker.print();
        System.out.println(originator.getContext());

        /*  Memento{context='第1个内容修改'}
            Memento{context='第2个内容修改'}
            Memento{context='第3个内容修改'}
            撤销1
            Memento{context='第1个内容修改'}
            Memento{context='第2个内容修改'}
            第3个内容修改
            撤销2
            Memento{context='第1个内容修改'}
            第2个内容修改
            撤销3
            第1个内容修改*/


    }
}
~~~
