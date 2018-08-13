package net.sjl.learn.deepinshallowout.factory.factorymethod;

import net.sjl.learn.deepinshallowout.factory.simple.Audi;
import net.sjl.learn.deepinshallowout.factory.simple.Car;

/*
 * @Time:2018/7/8 上午12:04
 * @Auther:Shijielei
 * @Describe: 奥迪汽车工厂
 */
public class AudiFactory implements CarFactory {

    public Car createCar() {
        return new Audi();
    }
}
