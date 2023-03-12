package memento;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:21:46
 */
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
