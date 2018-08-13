package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:22
 * @Auther:Shijielei
 * @Describe: T恤
 */
public class TShirt extends Costume {

    public TShirt(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.printf("T恤\t");
        super.show();
    }
}
