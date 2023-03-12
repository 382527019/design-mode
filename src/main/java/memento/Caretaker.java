package memento;

import java.util.Stack;

/**
 *管理者
 */
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
