package net.sjl.learn.deepinshallowout.tobuild.director;

import net.sjl.learn.deepinshallowout.tobuild.bean.media.Media;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.MediaItem;
import net.sjl.learn.deepinshallowout.tobuild.builder.MediaBuilder;

/*
 * @Time:2018/7/14 下午10:23
 * @Auther:Shijielei
 * @Describe: 媒体建造指导者
 */
public class MediaDirector {

    // 建造者
    private MediaBuilder mediaBuilder;

    // 构造
    public MediaDirector(MediaBuilder mediaBuilder) {
        this.mediaBuilder = mediaBuilder;
    }

    // 创建
    public Media createMedia(MediaItem[] mediaItems) {
        mediaBuilder.buildBase();
        for (MediaItem mediaItem : mediaItems) {
            mediaBuilder.addMediaElements(mediaItem);
        }
        return mediaBuilder.getFinshedMedia();
    }

}
