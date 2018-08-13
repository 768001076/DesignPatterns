package net.sjl.learn.deepinshallowout.singleton.lazy;

/*
 * @Time:2018/7/13 下午11:49
 * @Auther:Shijielei
 * @Describe: 懒汉
 */
public class LazySingleton {

    // 定义实例
    private static LazySingleton lazySingleton = null;

    // 私有化构造
    private LazySingleton() {

    }

    // 对外提供获取实例的方法
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton != null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
