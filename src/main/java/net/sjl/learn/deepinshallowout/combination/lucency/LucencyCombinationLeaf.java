package net.sjl.learn.deepinshallowout.combination.lucency;

/*
 * @Time:2018/7/18 上午1:08
 * @Auther:Shijielei
 * @Describe: 组合模式 透明 叶子
 */
public class LucencyCombinationLeaf extends LucencyCombinationBase {
    public LucencyCombinationLeaf(String name) {
        super(name);
    }

    public void addAuxiliary(LucencyCombinationBase base) {
        System.out.println(name + " Is a Leaf");
    }

    public void removeAuxiliary(LucencyCombinationBase base) {
        System.out.println(name + " Is a Leaf");
    }

    public void run(String path) {
        System.out.println(path + name);
    }
}
