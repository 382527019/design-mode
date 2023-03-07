package composite.safe;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<>();
    private int level;

    public CoursePackage(String name, int level) {
        super(name,0.0d);
        this.name = name;
        this.level = level;
    }

    public void addChild(CourseComponent component) {
        items.add(component);
    }

    public void removeChild(CourseComponent component) {
        items.remove(component);

    }

    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CourseComponent item : items) {
            for (int i = 0; i < this.level; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < this.level; i++) {
                if (i == 0) {
                    System.out.print("+");
                }
                System.out.print("-");
            }

            item.print();
        }

    }

    public List<CourseComponent> getItems() {
        return items;
    }

    public void setItems(List<CourseComponent> items) {
        this.items = items;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
