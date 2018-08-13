package net.sjl.learn.deepinshallowout.bright.implementor.concrete;

import net.sjl.learn.deepinshallowout.bright.implementor.ItemWorkImpl;

/*
 * @Time:2018/7/17 下午10:29
 * @Auther:Shijielei
 * @Describe: 创建订单实现
 */
public class CreateOrderImpl implements ItemWorkImpl {
    public void demand() {
        System.out.println("下单需求已确定");
    }

    public void design() {
        System.out.println("下单项目设计完成");
    }

    public void exploit() {
        System.out.println("下单项目开发完毕");
    }

    public void test() {
        System.out.println("下单项目已完成测试");
    }

    public void issue() {
        System.out.println("下单功能已上线");
    }
}
