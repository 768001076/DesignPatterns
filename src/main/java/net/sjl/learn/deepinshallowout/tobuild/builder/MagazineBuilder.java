package net.sjl.learn.deepinshallowout.tobuild.builder;

import net.sjl.learn.deepinshallowout.tobuild.bean.media.Magazine;
import net.sjl.learn.deepinshallowout.tobuild.bean.media.Media;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.MediaItem;

/*
 * @Time:2018/7/14 下午10:12
 * @Auther:Shijielei
 * @Describe: 杂志具体建造者
 */
public class MagazineBuilder implements MediaBuilder {

    private Magazine magazine;

    public void buildBase() {
        System.out.println("MagazineBuilder BuildBase: Magazine");
        magazine = new Magazine();
    }

    public void addMediaElements(MediaItem mediaItem) {
        System.out.println("MagazineBuilder AddMediaElements: " + mediaItem);
        magazine.add(mediaItem);
    }

    public Media getFinshedMedia() {
        return magazine;
    }
}
