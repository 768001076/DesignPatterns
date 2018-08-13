package net.sjl.learn.test.singleton;

import net.sjl.learn.deepinshallowout.singleton.registry.TestSingleton;

/*
 * @Time:2018/7/14 上午12:11
 * @Auther:Shijielei
 * @Describe: 单例测试
 */
public class SingletonTest {

    public static void main(String[] args) {
        TestSingleton instance = TestSingleton.getInstance();
        instance.test();
    }

}
