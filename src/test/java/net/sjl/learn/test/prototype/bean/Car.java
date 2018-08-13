package net.sjl.learn.test.prototype.bean;

import net.sjl.learn.deepinshallowout.prototype.ProtoTypeFather;

/*
 * @Time:2018/7/16 下午10:56
 * @Auther:Shijielei
 * @Describe: 原型模式测试使用实体类
 */
public class Car extends ProtoTypeFather {

    private double price;

    private int type;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", type=" + type +
                '}';
    }
}
