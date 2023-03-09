package delegate;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:18:42
 */
public class Boss {

    public void command(String job,Leader leader){
        System.out.println("老板命令："+"leader"+job);
        leader.word(job);
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command("设计",leader);
        boss.command("编码",leader);
        boss.command("销售",leader);
    }

    /*  老板命令：leader设计
        领委派：员工：delegate.EmployeeB设计
        老板命令：leader编码
        领委派：员工：delegate.EmployeeA编码
        老板命令：leader销售
        无法胜任*/
}
