package net.sjl.learn.deepinshallowout.factory.factorymethod;

import net.sjl.learn.deepinshallowout.factory.simple.Car;

/*
 * @Time:2018/7/7 下午11:59
 * @Auther:Shijielei
 * @Describe: 汽车工厂
 */
public interface CarFactory {
    
    /**
     * @Describe: 创建汽车
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: net.sjl.learn.deepinshallowout.factory.simple.Car
     * @Throws: []
     *
     */
    Car createCar();
    
}
