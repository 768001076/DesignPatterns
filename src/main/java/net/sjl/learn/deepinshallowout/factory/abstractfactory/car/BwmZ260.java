package net.sjl.learn.deepinshallowout.factory.abstractfactory.car;

/*
 * @Time:2018/7/10 下午11:50
 * @Auther:Shijielei
 * @Describe: 宝马Z260汽车
 */
public class BwmZ260 implements BwmCar {
    public BwmZ260() {
        setColor();
        setPerHour();
        setPrice();
    }

    public void setColor() {
        System.out.println("宝马C260颜色为:金色!");
    }

    public void setPerHour() {
        System.out.println("宝马C180时速为:300KM/H!");
    }

    public void setPrice() {
        System.out.println("宝马C180价格为:200W!");
    }
}
