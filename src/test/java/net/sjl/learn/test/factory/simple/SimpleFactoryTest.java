package net.sjl.learn.test.factory.simple;

import net.sjl.learn.deepinshallowout.factory.simple.Car;
import net.sjl.learn.deepinshallowout.factory.simple.CarFactory;
import net.sjl.learn.deepinshallowout.factory.simple.CarTypeEnum;

/*
 * @Time:2018/7/7 下午11:42
 * @Auther:Shijielei
 * @Describe: 简单工厂测试方法
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        // 汽车工厂
        CarFactory carFactory = new CarFactory();
        // 创建汽车
        Car car = carFactory.driverCar(CarTypeEnum.MERCEDES);
        // 开车
        car.drive();
    }

}
