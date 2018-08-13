package net.sjl.learn.deepinshallowout.bright.abstraction;

import net.sjl.learn.deepinshallowout.bright.implementor.ItemWorkImpl;

/*
 * @Time:2018/7/17 下午10:12
 * @Auther:Shijielei
 * @Describe: 桥梁模式 工作项目
 */
public class ItemWorkAbstract {

    // 实现角色
    private ItemWorkImpl itemWork;

    public ItemWorkAbstract(ItemWorkImpl itemWork) {
        this.itemWork = itemWork;
    }

    /**
     * @Describe: 工作
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void work() {
        itemWork.demand();
        itemWork.design();
        itemWork.exploit();
        itemWork.test();
        itemWork.issue();
    }

}
