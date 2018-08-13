package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:26
 * @Auther:Shijielei
 * @Describe: 针织衫
 */
public class Knitwear extends Costume {

    public Knitwear(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.printf("针织衫\t");
        super.show();
    }
}
