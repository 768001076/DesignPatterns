package net.sjl.learn.test.prototype;

import net.sjl.learn.deepinshallowout.prototype.ProtoManager;
import net.sjl.learn.test.prototype.bean.Car;
import net.sjl.learn.test.prototype.bean.User;
import org.junit.Test;

/*
 * @Time:2018/7/16 下午10:57
 * @Auther:Shijielei
 * @Describe: 原型模式测试
 */
public class ProtoTypeTest {

    @Test
    public void protoTypeTest() {
        User user = new User();
        Car car = new Car();
        ProtoManager.getInstance().addProtoType("initUser",user);
        user = new User();
        user.setName("shijialei");
        user.setAge(18);
        ProtoManager.getInstance().addProtoType("noCarUser",user);
        user = new User();
        car.setPrice(6000000.00d);
        car.setType(1);
        user.setCar(car);
        ProtoManager.getInstance().addProtoType("haveCarUser",user);
        System.out.println("initUser:" + ProtoManager.getInstance().getProtoType("initUser"));
        System.out.println("noCarUser:" + ProtoManager.getInstance().getProtoType("noCarUser"));
        System.out.println("haveCarUser:" + ProtoManager.getInstance().getProtoType("haveCarUser"));
        System.out.println("NotSave:" + ProtoManager.getInstance().getProtoType(User.class.getName()));

    }

}
