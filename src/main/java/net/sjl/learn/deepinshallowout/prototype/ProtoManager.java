package net.sjl.learn.deepinshallowout.prototype;

import java.util.HashMap;
import java.util.Map;

/*
 * @Time:2018/7/16 下午10:41
 * @Auther:Shijielei
 * @Describe: 原型管理器
 */
public class ProtoManager {

    // 原型关系
    private Map<String, ProtoTypeFather> protoRegistry = new HashMap<String, ProtoTypeFather>();

    // 私有化构造
    private static ProtoManager protoManager = null;

    // 私有化构造
    private ProtoManager() {

    }

    /**
     * @Describe: 获取实例
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: net.sjl.learn.deepinshallowout.prototype.ProtoManager
     * @Throws: []
     *
     */
    public static ProtoManager getInstance() {
        if (protoManager == null) {
            synchronized (ProtoManager.class) {
                if (protoManager == null) {
                    protoManager = new ProtoManager();
                }
            }
        }
        return protoManager;
    }

    /**
     * @Describe: 添加原型
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [name, protoType]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void addProtoType(String name, ProtoTypeFather protoType) {
        protoRegistry.put(name, protoType);
    }

    /**
     * @Describe: 删除原型
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [name]
     * @RetrunType: void
     * @Throws: []
     *
     */
    public void removeProtoType(String name) {
        protoRegistry.remove(name);
    }

    /**
     * @Describe: 获取对象
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [name]
     * @RetrunType: java.lang.Object
     * @Throws: []
     *
     */
    public ProtoTypeFather getProtoType(String name) {
        if (protoRegistry.containsKey(name)) {
            return (ProtoTypeFather)((ProtoTypeFather)protoRegistry.get(name)).clone();
        } else {
            ProtoTypeFather result = null;
            try {
                result = (ProtoTypeFather)Class.forName(name).newInstance();
                addProtoType(name, result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
    }

}
