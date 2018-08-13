package net.sjl.learn.deepinshallowout.bright.abstraction.speciflc;

import net.sjl.learn.deepinshallowout.bright.abstraction.ItemWorkAbstract;
import net.sjl.learn.deepinshallowout.bright.implementor.ItemWorkImpl;

/*
 * @Time:2018/7/17 下午10:24
 * @Auther:Shijielei
 * @Describe: 创建订单项目
 */
public class CreateOrderItem extends ItemWorkAbstract {

    public CreateOrderItem(ItemWorkImpl itemWork) {
        super(itemWork);
    }

    /**
     * @Describe: 开始下单
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void startCreateOrder() {
        System.out.println("新项目开始");
        work();
        System.out.println("完事了");
    }

}
