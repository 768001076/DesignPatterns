package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:27
 * @Auther:Shijielei
 * @Describe: 九分裤
 */
public class NinthPants extends Costume {

    public NinthPants(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.printf("九分裤\t");
        super.show();
    }
}
