package net.sjl.learn.test.factory.factorymethod;

import net.sjl.learn.deepinshallowout.factory.factorymethod.CarFactory;
import net.sjl.learn.deepinshallowout.factory.factorymethod.MercedesFactory;
import net.sjl.learn.deepinshallowout.factory.simple.Car;

/*
 * @Time:2018/7/8 上午12:06
 * @Auther:Shijielei
 * @Describe: 工厂方法模式测试
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        // 定义工厂
        CarFactory carFactory = new MercedesFactory();
        // 创建汽车
        Car car = carFactory.createCar();
        // 开车
        car.drive();

    }

}
