package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:09
 * @Auther:Shijielei
 * @Describe: 装饰模式 人
 */
public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    /**
     * @Describe: 展示
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void show() {
        System.out.print("装扮的" + name);
    }

}
