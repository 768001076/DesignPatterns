package net.sjl.learn.test.decorator;

import net.sjl.learn.deepinshallowout.decorator.*;
import org.junit.Test;

/*
 * @Time:2018/7/18 下午10:29
 * @Auther:Shijielei
 * @Describe: 装饰模式 服装测试
 */
public class PersonCostumeTest {

    /**
     * @Describe: 服装测试
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    @Test
    public void costumeTest() {
        Person person = new Person("时佳磊");
        System.out.println("第一种装扮:");
        Canvas canvas = new Canvas(person);
        NinthPants ninthPants = new NinthPants(canvas);
        TShirt tShirt = new TShirt(ninthPants);
        tShirt.show();
        System.out.println("\n第二种装扮");
        Knitwear knitwear = new Knitwear(person);
        Jeans jeans = new Jeans(knitwear);
        Sneaker sneaker = new Sneaker(jeans);
        sneaker.show();

    }

}
