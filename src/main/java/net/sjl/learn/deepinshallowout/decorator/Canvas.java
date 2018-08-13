package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:25
 * @Auther:Shijielei
 * @Describe: 帆布鞋
 */
public class Canvas extends Costume {

    public Canvas(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.printf("帆布鞋\t");
        super.show();
    }
}
