package net.sjl.learn.deepinshallowout.factory.simple;

/*
 * @Time:2018/7/7 下午11:33
 * @Auther:Shijielei
 * @Describe: 汽车类型
 */
public enum  CarTypeEnum {
    MERCEDES(1),// 奔驰
    AUDI(2),// 奥迪
    BMW(3);// 宝马

    private int no;

    CarTypeEnum(int no) {
        this.no = no;
    }
}
