package net.sjl.learn.deepinshallowout.combination.safety;

/*
 * @Time:2018/7/18 上午12:29
 * @Auther:Shijielei
 * @Describe: 组合模式 安全 根节点
 */
public abstract class SafetyCombinationBase {

    protected String name = "root";

    public SafetyCombinationBase(String name) {
        this.name = name;
    }

    /**
     * @Describe: 工作进行
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    abstract void run(String path);

}
