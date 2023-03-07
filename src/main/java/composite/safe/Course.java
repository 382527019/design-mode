package composite.safe;

import lombok.Data;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/7
 * Time:22:43
 */
public class Course extends CourseComponent {

    public Course(String name,double price){
        super(name,price);
    }

    @Override
    public void print() {
        System.out.println(this.name+"("+this.price+" 元)");
    }


}
