# 委派模式

* 委派对象本身不知道如何处理一个任务/请求，把任务交给其他对象处理

* Boss委派任务给领导
~~~
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
~~~

* 领导分配工作给员工
~~~
public class Leader implements Employee {
    private static Map<String, Employee> jobMap = new HashMap();

    static {
        jobMap.put("编码", new EmployeeA());
        jobMap.put("设计", new EmployeeB());
    }

    @Override
    public void word(String job) {
        if (!jobMap.containsKey(job)) {
            System.out.println("无法胜任");
        }
        System.out.print("领委派：");
        Employee employee = jobMap.get(job);
        employee.word(job);
    }
}
~~~
