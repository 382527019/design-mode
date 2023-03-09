package delegate;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:18:43
 */
public class EmployeeA implements Employee{

    private String job = "编码";

    @Override
    public void word(String job) {
        System.out.println("员工："+EmployeeA.class.getName()+job);
    }
}
