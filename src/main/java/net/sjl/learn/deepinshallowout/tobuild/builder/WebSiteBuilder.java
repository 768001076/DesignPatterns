package net.sjl.learn.deepinshallowout.tobuild.builder;

import net.sjl.learn.deepinshallowout.tobuild.bean.media.Media;
import net.sjl.learn.deepinshallowout.tobuild.bean.media.WebSite;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.MediaItem;

/*
 * @Time:2018/7/14 下午10:17
 * @Auther:Shijielei
 * @Describe: Web项目具体建造者
 */
public class WebSiteBuilder implements MediaBuilder {

    private WebSite webSite;

    public void buildBase() {
        System.out.println("WebSiteBuilder BuildBase: WebSite");
        webSite = new WebSite();
    }

    public void addMediaElements(MediaItem mediaItem) {
        System.out.println("WebSiteBuilder AddMediaElements: " + mediaItem);
        webSite.add(mediaItem);
    }

    public Media getFinshedMedia() {
        return webSite;
    }
}
