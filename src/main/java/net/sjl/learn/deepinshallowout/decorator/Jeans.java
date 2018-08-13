package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:24
 * @Auther:Shijielei
 * @Describe: 牛仔裤
 */
public class Jeans extends Costume {

    public Jeans(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.printf("牛仔裤\t");
        super.show();
    }
}
