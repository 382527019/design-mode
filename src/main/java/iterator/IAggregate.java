package iterator;

/**
 *集合
 */
public interface IAggregate<E> {

    void add(E e);

    void remove(E e);

    E get(int index);

    /*集合的迭代器*/
    Iterator<E> iterator();
}
