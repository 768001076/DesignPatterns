package net.sjl.learn.deepinshallowout.combination.safety;

/*
 * @Time:2018/7/18 上午12:34
 * @Auther:Shijielei
 * @Describe: 组合模式 安全 叶子
 */
public class SafetyCombinationLeaf extends SafetyCombinationBase {
    public SafetyCombinationLeaf(String name) {
        super(name);
    }

    public void run(String path) {
        System.out.println(path + name);
    }
}
