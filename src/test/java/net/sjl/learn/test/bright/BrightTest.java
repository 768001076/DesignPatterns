package net.sjl.learn.test.bright;

import net.sjl.learn.deepinshallowout.bright.abstraction.speciflc.CreateOrderItem;
import net.sjl.learn.deepinshallowout.bright.abstraction.speciflc.PayOrderItem;
import net.sjl.learn.deepinshallowout.bright.implementor.concrete.CreateOrderImpl;
import net.sjl.learn.deepinshallowout.bright.implementor.concrete.PayOrderImpl;
import org.junit.Test;

/*
 * @Time:2018/7/17 下午10:47
 * @Auther:Shijielei
 * @Describe: 桥梁模式测试
 */
public class BrightTest {
    /**
     * @Describe: 下单
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    @Test
    public void createOrder() {
        CreateOrderImpl createOrder = new CreateOrderImpl();
        CreateOrderItem item = new CreateOrderItem(createOrder);
        item.startCreateOrder();
    }
    /**
     * @Describe: 开始支付
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    @Test
    public void payOrder() {
        PayOrderImpl payOrder = new PayOrderImpl();
        PayOrderItem payOrderItem = new PayOrderItem(payOrder);
        payOrderItem.startPayOrder();
    }

}
