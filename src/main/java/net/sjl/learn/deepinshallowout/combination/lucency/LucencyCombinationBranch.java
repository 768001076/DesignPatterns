package net.sjl.learn.deepinshallowout.combination.lucency;

import java.util.List;
import java.util.Vector;

/*
 * @Time:2018/7/18 上午1:05
 * @Auther:Shijielei
 * @Describe: 组合模式 透明 树枝
 */
public class LucencyCombinationBranch extends LucencyCombinationBase {

    private List<LucencyCombinationBase> auxiliary = new Vector<LucencyCombinationBase>();

    public LucencyCombinationBranch(String name) {
        super(name);
    }

    public void addAuxiliary(LucencyCombinationBase base) {
        auxiliary.add(base);
    }

    public void removeAuxiliary(LucencyCombinationBase base) {
        auxiliary.remove(base);
    }

    public void run(String path) {
        System.out.println(path + " " + name);
        path += "-- ";
        for (LucencyCombinationBase lucencyCombinationBase : auxiliary) {
            lucencyCombinationBase.run(path);
        }
    }
}
