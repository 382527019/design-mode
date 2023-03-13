package mediator;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/13
 * Time:14:11
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague concreteColleagueA = new ConcreteColleagueA(mediator);
        Colleague concreteColleagueB = new ConcreteColleagueB(mediator);
        System.out.println("===============");
        /*A实现*/
        concreteColleagueA.selfMethod();
        /*A 让中介者联系-B*/
        mediator.setColleague(concreteColleagueB);
        concreteColleagueA.depMethod();
        mediator.setState(true);//完成
        System.out.println("===============");
        /*B实现*/
        concreteColleagueB.selfMethod();
        /*B 让中介者联系-A*/
        mediator.setColleague(concreteColleagueA);
        concreteColleagueB.depMethod();
        System.out.println("===============");
        /*A 没让中介者联系-B*/
        concreteColleagueA.depMethod();

        /*  ===============
            mediator.ConcreteColleagueA[A]self
            mediator.ConcreteColleagueA[A]dep self handler
            mediator.ConcreteColleagueB[B]self
            ===============
            mediator.ConcreteColleagueB[B]self
            mediator.ConcreteColleagueB[B]dep self handler
            mediator.ConcreteColleagueA[A]self
            ===============
            mediator.ConcreteColleagueA[A]dep self handler
            mediator.ConcreteColleagueA调用错误*/

    }
}
