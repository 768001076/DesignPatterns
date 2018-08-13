package net.sjl.learn.deepinshallowout.factory.abstractfactory;

import net.sjl.learn.deepinshallowout.factory.abstractfactory.car.BwmZ260;
import net.sjl.learn.deepinshallowout.factory.abstractfactory.navigator.NavigatorZ260;

/*
 * @Time:2018/7/10 下午11:57
 * @Auther:Shijielei
 * @Describe: CZ260工厂
 */
public class BwmZ260Factory implements BwmFactory {
    public void createCar() {
        new BwmZ260();
    }

    public void createNavigator() {
        new NavigatorZ260();
    }
}
