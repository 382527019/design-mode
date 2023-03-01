package builder;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:17:43
 */
public class BuilderTest {
    public static void main(String[] args) {
        HumanBuilder human = new HumanBuilder.Builder().age("18").name("name").build();
        System.out.println(human);
    }
}
