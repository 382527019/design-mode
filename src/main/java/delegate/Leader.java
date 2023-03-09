package delegate;

import proxy.staticproxy.Man;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:18:46
 */
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
