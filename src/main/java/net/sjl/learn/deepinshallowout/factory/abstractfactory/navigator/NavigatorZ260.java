package net.sjl.learn.deepinshallowout.factory.abstractfactory.navigator;

/*
 * @Time:2018/7/10 下午11:52
 * @Auther:Shijielei
 * @Describe: 导航仪Z260
 */
public class NavigatorZ260 implements Navigator {

    public NavigatorZ260() {
        setColor();
        setPrice();
    }

    public void setColor() {
        System.out.println("导航仪Z260的颜色为:金色!");
    }

    public void setPrice() {
        System.out.println("导航仪Z26的价格为:3000!");
    }
}
