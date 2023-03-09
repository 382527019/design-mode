package delegate;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:18:43
 */
public class EmployeeB implements Employee{

    private String job = "设计";

    @Override
    public void word(String job) {
        System.out.println("员工："+EmployeeB.class.getName()+job);
    }
}
