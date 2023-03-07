package composite.transparent;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<>();

    private String name;
    private int level;

    public CoursePackage(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent component) {
        items.add(component);
    }

    @Override
    public void removeChild(CourseComponent component) {
        items.remove(component);

    }

    @Override
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
}
