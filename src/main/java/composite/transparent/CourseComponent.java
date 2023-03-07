package composite.transparent;

/**
 * 抽象组件
 */
public abstract class CourseComponent {

    /*
    * 所有一致操作都定义到抽象类上
    * */

    public void addChild(CourseComponent component){
        throw new UnsupportedOperationException("no supported add");
    }

    public void removeChild(CourseComponent component){
        throw new UnsupportedOperationException("no supported remove");
    }

    public String getName(CourseComponent component){
        throw new UnsupportedOperationException("no supported add");
    }

    public double getPrice(CourseComponent component){
        throw new UnsupportedOperationException("no supported price");
    }

    public void print(){
        throw new UnsupportedOperationException("no supported print");
    }
}
