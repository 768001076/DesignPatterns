package net.sjl.learn.deepinshallowout.factory.abstractfactory;

import net.sjl.learn.deepinshallowout.factory.abstractfactory.car.BwmC180;
import net.sjl.learn.deepinshallowout.factory.abstractfactory.navigator.NavigatorC180;

/*
 * @Time:2018/7/10 下午11:57
 * @Auther:Shijielei
 * @Describe: C180工厂
 */
public class BwmC180Factory implements BwmFactory {
    public void createCar() {
        new BwmC180();
    }

    public void createNavigator() {
        new NavigatorC180();
    }
}
