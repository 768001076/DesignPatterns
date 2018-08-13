package net.sjl.learn.deepinshallowout.singleton.registry;

import java.util.HashMap;

/*
 * @Time:2018/7/13 下午11:57
 * @Auther:Shijielei
 * @Describe: 注册表模式
 */
public class RegisterSingleton {

    // 实例关系
    private static HashMap<String, Object> registrySingleton = new HashMap<String, Object>();

    // 实例
    private static RegisterSingleton registerSingleton = new RegisterSingleton();

    // 构造
    protected RegisterSingleton() {

    }

    // 获取实例方法
    public static RegisterSingleton getInstance(String name) {
        if (name == null) {
            name = "RegisterSingleton";
        }
        if (registrySingleton.get(name) == null) {
            try {
                registrySingleton.put(name, Class.forName(name).newInstance());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return (RegisterSingleton)registrySingleton.get(name);
    }

    public void test() {
        System.out.println("RegisterSingleton");
    }

}
