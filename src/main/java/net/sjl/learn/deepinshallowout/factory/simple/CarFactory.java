package net.sjl.learn.deepinshallowout.factory.simple;

/*
 * @Time:2018/7/7 下午11:29
 * @Auther:Shijielei
 * @Describe: 汽车工厂
 */
public class CarFactory {

    /**
     * @Describe: 创建汽车
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [carType]
     * @RetrunType: net.sjl.learn.deepinshallowout.factory.simple.Car
     * @Throws: []
     *
     */
    public Car driverCar(CarTypeEnum carType) {
        Car car;
        switch (carType) {
            case MERCEDES:
                car = new Mercedes();
                break;
            case AUDI:
                car = new Audi();
                break;
            case BMW:
                car = new Bmw();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }

}
