package net.sjl.learn.deepinshallowout.factory.factorymethod;

import net.sjl.learn.deepinshallowout.factory.simple.Bmw;
import net.sjl.learn.deepinshallowout.factory.simple.Car;

/*
 * @Time:2018/7/8 上午12:02
 * @Auther:Shijielei
 * @Describe: 宝马汽车工厂
 */
public class BmwFactory implements CarFactory {

    public Car createCar() {
        return new Bmw();
    }
}
