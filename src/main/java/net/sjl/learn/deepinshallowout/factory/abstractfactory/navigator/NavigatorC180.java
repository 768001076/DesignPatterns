package net.sjl.learn.deepinshallowout.factory.abstractfactory.navigator;

/*
 * @Time:2018/7/10 下午11:52
 * @Auther:Shijielei
 * @Describe: 导航仪C180
 */
public class NavigatorC180 implements Navigator {

    public NavigatorC180() {
        setColor();
        setPrice();
    }

    public void setColor() {
        System.out.println("导航仪C180的颜色为:银色!");
    }

    public void setPrice() {
        System.out.println("导航仪C180的价格为:3000!");
    }
}
