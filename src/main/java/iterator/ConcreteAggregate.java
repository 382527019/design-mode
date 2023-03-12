package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ConcreteAggregate<E> implements IAggregate<E> {


    private List<E> list;

    public ConcreteAggregate() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        list.add(e);
    }

    @Override
    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(list);
    }
}
