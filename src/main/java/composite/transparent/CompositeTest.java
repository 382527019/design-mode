package composite.transparent;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/7
 * Time:23:02
 */
public class CompositeTest {

    public static void main(String[] args) {
        CourseComponent java = new Course("Java1", 100);
        CourseComponent golang = new Course("golang", 1010);
        CourseComponent golang2 = new Course("Golang2", 5500);
        CourseComponent golang3 = new Course("Golang3", 5060);
        CourseComponent golang4 = new Course("Golang4", 50041);
        CourseComponent golang5 = new Course("Golang5", 50025);
        CourseComponent coursePackage2 = new CoursePackage("编程语言--2", 2);
        CourseComponent coursePackage3 = new CoursePackage("编程语言---3", 3);
        CourseComponent coursePackage1 = new CoursePackage("编程语言-1", 1);
        coursePackage1.addChild(java);
        coursePackage1.addChild(golang5);
        coursePackage2.addChild(golang4);
        coursePackage3.addChild(golang2);
        coursePackage2.addChild(golang3);
        coursePackage3.addChild(golang);
        coursePackage1.addChild(coursePackage2);
        coursePackage2.addChild(coursePackage3);

        coursePackage1.print();

        /*  编程语言-1
             +-Java1(100.0 元)
             +-Golang5(50025.0 元)
             +-编程语言--2
              +--Golang4(50041.0 元)
              +--Golang3(5060.0 元)
              +--编程语言---3
               +---Golang2(5500.0 元)
               +---golang(1010.0 元)
               */
    }
}
