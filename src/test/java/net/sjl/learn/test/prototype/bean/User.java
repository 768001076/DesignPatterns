package net.sjl.learn.test.prototype.bean;

import net.sjl.learn.deepinshallowout.prototype.ProtoTypeFather;

/*
 * @Time:2018/7/16 下午10:54
 * @Auther:Shijielei
 * @Describe: 原型模式测试使用实体类
 */
public class User extends ProtoTypeFather {

    private String name;

    private int age;

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected Object clone() {
        User user = null;
        try {
            user = (User)super.clone();
            if (car != null) {
                user.car = (Car)car.clone();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
