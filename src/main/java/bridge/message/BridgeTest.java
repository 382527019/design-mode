package bridge.message;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/9
 * Time:17:57
 */
public class BridgeTest {

    public static void main(String[] args) {
        IMessage emailMessage = new EmailMessage();
        IMessage smsMessage = new SmsMessage();
        OrdinaryLevel ordinaryLevel = new OrdinaryLevel(smsMessage);
        UrgentLevel urgentLevel = new UrgentLevel(emailMessage);
        ordinaryLevel.send("admin","send context。。。");
        urgentLevel.send("admin321","send context。。。");
    }
}
