package prototype.deepclone;

import java.io.*;
import java.util.Date;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:15:54
 */
public class Hero extends Human implements Serializable,Cloneable {

    private Weapon weapon;

    public Hero() {
        //初始化
        this.birthday = new Date();
        this.weapon = new Weapon();
    }

    @Override
    public Hero clone() {
        return this.deepClone();
    }

    private Hero deepClone() {
        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Hero copy = (Hero)ois.readObject();
            copy.setBirthday(this.birthday);
            copy.setHigh(this.high);
            copy.setWeight(this.weight);
            return copy;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
