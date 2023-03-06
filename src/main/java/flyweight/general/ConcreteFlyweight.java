package flyweight.general;

/**
 */
public class ConcreteFlyweight extends Flyweight{

    /* 内部状态*/
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /* 外部状态*/
    @Override
    String operattion(String extrinsicState) {
        System.out.println("Obj address:" +this);
        System.out.println("Obj intrinsicState:" +this.intrinsicState);
        System.out.println("Obj extrinsicState:" +extrinsicState);
        return this+"享元操作结束";
    }
}
