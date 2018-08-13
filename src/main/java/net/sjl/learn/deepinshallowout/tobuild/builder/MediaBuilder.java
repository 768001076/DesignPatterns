package net.sjl.learn.deepinshallowout.tobuild.builder;

import net.sjl.learn.deepinshallowout.tobuild.bean.media.Media;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.MediaItem;

/*
 * @Time:2018/7/14 下午9:56
 * @Auther:Shijielei
 * @Describe: 媒体抽象建造者
 */
public interface MediaBuilder {
    
    /**
     * @Describe: 构建产品对象
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: void
     * @Throws: []
     *
     */
    void buildBase();

    /**
     * @Describe: 增加媒体元素
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: [mediaItem]
     * @RetrunType: void
     * @Throws: []
     *
     */
    void addMediaElements(MediaItem mediaItem);
    
    /**
     * @Describe: 获取媒体对象
     * @Version: 1.0
     * @Auther: shijialei
     * @Params: []
     * @RetrunType: net.sjl.learn.deepinshallowout.tobuild.bean.media.Media
     * @Throws: []
     *
     */
    Media getFinshedMedia();
    
}
