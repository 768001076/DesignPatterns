package net.sjl.learn.deepinshallowout.singleton.hunger;

/*
 * @Time:2018/7/13 下午11:41
 * @Auther:Shijielei
 * @Describe: 饿汉
 */
public class HungerSingleton {

    // 创建私有化实例
    private static HungerSingleton hungerSingleton = new HungerSingleton();

    // 私有化构造方法
    private HungerSingleton() {
    }

    // 对外提供获取实例的方法
    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }

}
