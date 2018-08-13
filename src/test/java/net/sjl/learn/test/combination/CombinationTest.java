package net.sjl.learn.test.combination;

import net.sjl.learn.deepinshallowout.combination.lucency.LucencyCombinationBase;
import net.sjl.learn.deepinshallowout.combination.lucency.LucencyCombinationBranch;
import net.sjl.learn.deepinshallowout.combination.lucency.LucencyCombinationLeaf;
import net.sjl.learn.deepinshallowout.combination.safety.SafetyCombinationBase;
import net.sjl.learn.deepinshallowout.combination.safety.SafetyCombinationBranch;
import net.sjl.learn.deepinshallowout.combination.safety.SafetyCombinationLeaf;
import org.junit.Test;

/*
 * @Time:2018/7/18 上午12:45
 * @Auther:Shijielei
 * @Describe: 组合模式测试
 */
public class CombinationTest {
    
    /**
     * @Describe: 安全方式测试
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    @Test
    public void safetyTest() {
        SafetyCombinationBranch root = new SafetyCombinationBranch("root");
        root.addAuxiliary(new SafetyCombinationLeaf("leaf-1"));
        root.addAuxiliary(new SafetyCombinationLeaf("leaf-2"));
        SafetyCombinationBranch home = new SafetyCombinationBranch("home");
        SafetyCombinationBranch shijialei = new SafetyCombinationBranch("shijialei");
        shijialei.addAuxiliary(new SafetyCombinationLeaf("shijialei-use"));
        SafetyCombinationBranch niuxuwu = new SafetyCombinationBranch("niuxuwu");
        niuxuwu.addAuxiliary(new SafetyCombinationLeaf("niuxuwu-use"));
        home.addAuxiliary(shijialei);
        home.addAuxiliary(niuxuwu);
        home.addAuxiliary(new SafetyCombinationLeaf("null"));
        root.addAuxiliary(home);
        root.run("");
    }

    /**
     * @Describe: 透明测试
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    @Test
    public void lucencyTest() {
        LucencyCombinationBase root = new LucencyCombinationBranch("root");
        root.addAuxiliary(new LucencyCombinationLeaf("leaf-1"));
        root.addAuxiliary(new LucencyCombinationLeaf("leaf-2"));
        LucencyCombinationBase home = new LucencyCombinationBranch("home");
        LucencyCombinationBase shijialei = new LucencyCombinationBranch("shijialei");
        shijialei.addAuxiliary(new LucencyCombinationLeaf("shijialei-test"));
        LucencyCombinationBase niuxuwu = new LucencyCombinationBranch("niuxuwu");
        niuxuwu.addAuxiliary(new LucencyCombinationLeaf("niuxuw-test"));
        home.addAuxiliary(shijialei);
        home.addAuxiliary(niuxuwu);
        root.addAuxiliary(home);
        root.run("");
    }
    
}
