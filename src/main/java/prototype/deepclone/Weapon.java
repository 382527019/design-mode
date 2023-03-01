package prototype.deepclone;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:15:57
 */
public class Weapon implements Serializable,Cloneable {
    /** 描述*/
    private List<String> describe;
    /** 攻击力*/
    private String strength;


    public List<String> getDescribe() {
        return describe;
    }

    public void setDescribe(List<String> describe) {
        this.describe = describe;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public Weapon clone() {
        try {
            Weapon clone = (Weapon) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
