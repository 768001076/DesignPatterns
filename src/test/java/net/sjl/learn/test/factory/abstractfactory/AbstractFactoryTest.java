package net.sjl.learn.test.factory.abstractfactory;

import net.sjl.learn.deepinshallowout.factory.abstractfactory.BwmC180Factory;
import net.sjl.learn.deepinshallowout.factory.abstractfactory.BwmFactory;
import net.sjl.learn.deepinshallowout.factory.abstractfactory.BwmZ260Factory;

/*
 * @Time:2018/7/10 下午11:59
 * @Auther:Shijielei
 * @Describe: 抽象工厂模式测试
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        System.out.println("宝马C180");
        BwmFactory c180Factory = new BwmC180Factory();
        c180Factory.createCar();
        c180Factory.createNavigator();

        System.out.println("----------------");

        System.out.println("宝马Z260");
        BwmFactory z260Factory = new BwmZ260Factory();
        z260Factory.createCar();
        z260Factory.createNavigator();
    }

}
