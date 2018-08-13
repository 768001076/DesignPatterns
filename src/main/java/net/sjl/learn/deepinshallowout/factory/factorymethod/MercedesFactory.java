package net.sjl.learn.deepinshallowout.factory.factorymethod;

import net.sjl.learn.deepinshallowout.factory.simple.Car;
import net.sjl.learn.deepinshallowout.factory.simple.Mercedes;

/*
 * @Time:2018/7/8 上午12:01
 * @Auther:Shijielei
 * @Describe: 奔驰汽车工厂
 */
public class MercedesFactory implements CarFactory {

    public Car createCar() {
        return new Mercedes();
    }

}
