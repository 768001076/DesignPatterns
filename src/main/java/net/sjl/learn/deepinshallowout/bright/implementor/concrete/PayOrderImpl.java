package net.sjl.learn.deepinshallowout.bright.implementor.concrete;

import net.sjl.learn.deepinshallowout.bright.implementor.ItemWorkImpl;

/*
 * @Time:2018/7/17 下午10:29
 * @Auther:Shijielei
 * @Describe: 支付实现
 */
public class PayOrderImpl implements ItemWorkImpl {
    public void demand() {
        System.out.println("支付需求已确定");
    }

    public void design() {
        System.out.println("支付项目设计完成");
    }

    public void exploit() {
        System.out.println("支付项目开发完毕");
    }

    public void test() {
        System.out.println("支付项目已完成测试");
    }

    public void issue() {
        System.out.println("支付功能已上线");
    }
}
