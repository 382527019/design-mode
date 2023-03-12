package iterator;

import java.util.List;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:15:22
 */
public class ConcreteIterator<E> implements Iterator {

    private List<E> list;

    private int index;

    private E element;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < this.list.size();
    }

    @Override
    public E next() {
        E e = this.list.get(index);
        index++;
        return e;
    }
}
