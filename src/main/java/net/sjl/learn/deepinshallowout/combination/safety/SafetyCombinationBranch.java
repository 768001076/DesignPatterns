package net.sjl.learn.deepinshallowout.combination.safety;

import java.util.List;
import java.util.Vector;

/*
 * @Time:2018/7/18 上午12:36
 * @Auther:Shijielei
 * @Describe: 组合模式 安全 树枝
 */
public class SafetyCombinationBranch extends SafetyCombinationBase {

    // 枝叶
    private List<SafetyCombinationBase> auxiliary = new Vector<SafetyCombinationBase>();

    public SafetyCombinationBranch(String name) {
        super(name);
    }
    
    public void run(String path) {
        path += "-";
        for (SafetyCombinationBase safetyCombinationBase : auxiliary) {
            safetyCombinationBase.run(path);
        }
    }
    
    /**
     * @Describe: 添加枝叶
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [safetyCombinationBase]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void addAuxiliary(SafetyCombinationBase safetyCombinationBase) {
        auxiliary.add(safetyCombinationBase);
    }
    
    /**
     * @Describe: 删除枝叶
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [safetyCombinationBase]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void removeAuxiliary(SafetyCombinationBase safetyCombinationBase) {
        auxiliary.remove(safetyCombinationBase);
    }
    
}
