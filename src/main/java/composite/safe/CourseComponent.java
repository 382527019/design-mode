package composite.safe;

/**
 * 抽象组件
 */
public abstract class CourseComponent {

    protected String name;
    protected double price;

    public CourseComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void print();
}

