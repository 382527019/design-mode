package singleton.enumsingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/2/5
 * Time:21:53
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        try {
            EnumSingleton instance = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setData(new Object());
            //输出流写入
            FileOutputStream fos = new FileOutputStream("EnumObj.md");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            //当调用者调用flush方法或者当缓冲区满了之后，数据就会从缓冲区中出来，写入到文件中
            oos.flush();
            oos.close();

            //输入流读出
            FileInputStream fis = new FileInputStream("EnumObj.md");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance =(EnumSingleton) ois.readObject();
            ois.close();
            if (instance!=instance2)
                System.out.println("两个对象不一样");
            else
                System.out.println("俩个对象一样");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
