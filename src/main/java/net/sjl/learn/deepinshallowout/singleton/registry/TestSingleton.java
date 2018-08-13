package net.sjl.learn.deepinshallowout.singleton.registry;

/*
 * @Time:2018/7/14 上午12:05
 * @Auther:Shijielei
 * @Describe: 注册表单例模式测试
 */
public class TestSingleton extends RegisterSingleton {

    // 构造
    protected TestSingleton() {

    }

    public static TestSingleton getInstance() {
        return (TestSingleton)RegisterSingleton.getInstance(TestSingleton.class.getName());
    }

    public void test() {
        System.out.println("TestSingleton");
    }

}
