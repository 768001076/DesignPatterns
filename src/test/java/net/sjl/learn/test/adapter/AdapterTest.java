package net.sjl.learn.test.adapter;

import net.sjl.learn.deepinshallowout.adapter.Diamonds;
import net.sjl.learn.deepinshallowout.adapter.Drawing;
import net.sjl.learn.deepinshallowout.adapter.Point;

/*
 * @Time:2018/7/17 下午9:43
 * @Auther:Shijielei
 * @Describe: 适配器模式测试
 */
public class AdapterTest {

    public static void main(String[] args) {
        Drawing drawing = new Point();
        String draw = drawing.draw();
        System.out.println(draw);
    }

}
