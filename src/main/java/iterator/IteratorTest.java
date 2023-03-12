package iterator;

/**
 */
public class IteratorTest {

    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
