package net.sjl.learn.deepinshallowout.prototype;

/*
 * @Time:2018/7/16 下午11:02
 * @Auther:Shijielei
 * @Describe: 原型父类
 */
public class ProtoTypeFather implements Cloneable {
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
