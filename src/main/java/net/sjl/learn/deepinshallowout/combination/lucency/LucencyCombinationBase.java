package net.sjl.learn.deepinshallowout.combination.lucency;

/*
 * @Time:2018/7/18 上午1:00
 * @Auther:Shijielei
 * @Describe: 组合模式 透明 root
 */
public abstract class LucencyCombinationBase {

    protected String name;

    public LucencyCombinationBase(String name) {
        this.name = name;
    }

    /**
     * @Describe: 添加枝叶
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [base]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public abstract void addAuxiliary(LucencyCombinationBase base);

    /**
     * @Describe: 删除枝叶
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [base]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public abstract void removeAuxiliary(LucencyCombinationBase base);

    /**
     * @Describe: 工作
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [path]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public abstract void run(String path);

}
