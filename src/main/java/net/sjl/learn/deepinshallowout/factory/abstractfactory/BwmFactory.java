package net.sjl.learn.deepinshallowout.factory.abstractfactory;

/*
 * @Time:2018/7/10 下午11:55
 * @Auther:Shijielei
 * @Describe: 汽车工厂
 */
public interface BwmFactory {
    
    /**
     * @Describe: 创建汽车
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    void createCar();
    
    /**
     * @Describe: 创建导航仪
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    void createNavigator();
    
}
