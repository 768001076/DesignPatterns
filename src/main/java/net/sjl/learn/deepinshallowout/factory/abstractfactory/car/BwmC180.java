package net.sjl.learn.deepinshallowout.factory.abstractfactory.car;

/*
 * @Time:2018/7/10 下午11:47
 * @Auther:Shijielei
 * @Describe: 宝马C180汽车
 */
public class BwmC180 implements BwmCar {

    public BwmC180() {
        setColor();
        setPerHour();
        setPrice();
    }

    public void setColor() {
        System.out.println("宝马C180颜色为:银色!");
    }

    public void setPerHour() {
        System.out.println("宝马C180时速为:200KM/H!");
    }

    public void setPrice() {
        System.out.println("宝马C180价格为:100W!");
    }
}
