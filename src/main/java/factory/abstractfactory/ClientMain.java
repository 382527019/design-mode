package factory.abstractfactory;

import factory.abstractfactory.fimpl.GolangFactory;
import factory.abstractfactory.fimpl.JavaFactory;
import factory.abstractfactory.fimpl.PythonFactory;
import factory.abstractfactory.pimpl.FrameworkAdvance;
import factory.abstractfactory.pimpl.GrammarAdvance;
import factory.abstractfactory.pimpl.GrammarBase;
import factory.abstractfactory.pimpl.GrammarMaster;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/1/11
 * Time:23:21
 */
public class ClientMain {

    public static void main(String[] args) {
        AbstractFactory factory = new GolangFactory();
        factory.createBaseProduct(GrammarBase.class).learn();
        factory.createAdvanceProduct(GrammarAdvance.class).learn();
        factory.createMasterProduct(GrammarMaster.class).learn();
        factory.createAdvanceProduct(FrameworkAdvance.class).learn();

        factory = new JavaFactory();
        factory.createBaseProduct(GrammarBase.class).learn();
        factory.createAdvanceProduct(GrammarAdvance.class).learn();
        factory.createMasterProduct(GrammarMaster.class).learn();
        factory.createAdvanceProduct(FrameworkAdvance.class).learn();

        factory = new PythonFactory();
        factory.createBaseProduct(GrammarBase.class).learn();
        factory.createAdvanceProduct(GrammarAdvance.class).learn();
        factory.createMasterProduct(GrammarMaster.class).learn();
        factory.createAdvanceProduct(FrameworkAdvance.class).learn();
    }
}
