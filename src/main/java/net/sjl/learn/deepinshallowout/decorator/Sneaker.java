package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:28
 * @Auther:Shijielei
 * @Describe: 运动鞋
 */
public class Sneaker extends Costume {

    public Sneaker(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.printf("运动鞋\t");
        super.show();
    }
}
