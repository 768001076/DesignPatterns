package net.sjl.learn.test.tobuild;

import net.sjl.learn.deepinshallowout.tobuild.bean.media.Media;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.Article;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.Chapter;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.MediaItem;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.WebItem;
import net.sjl.learn.deepinshallowout.tobuild.builder.BookBuilder;
import net.sjl.learn.deepinshallowout.tobuild.builder.MagazineBuilder;
import net.sjl.learn.deepinshallowout.tobuild.builder.WebSiteBuilder;
import net.sjl.learn.deepinshallowout.tobuild.director.MediaDirector;
import org.junit.Test;

/*
 * @Time:2018/7/14 下午10:21
 * @Auther:Shijielei
 * @Describe: 建造者模式测试
 */
public class ToBuilderTest {

    private MediaItem[] mediaItems = {new Chapter("章节"),new Article("文章"),new WebItem("网络")};

    @Test
    public void bookTest() {
        MediaDirector mediaDirector = new MediaDirector(new BookBuilder());
        Media media = mediaDirector.createMedia(mediaItems);
        System.out.println(media);
    }
    @Test
    public void magazineTest() {
        MediaDirector mediaDirector = new MediaDirector(new MagazineBuilder());
        Media media = mediaDirector.createMedia(mediaItems);
        System.out.println(media);
    }
    @Test
    public void webSiteTest() {
        MediaDirector mediaDirector = new MediaDirector(new WebSiteBuilder());
        Media media = mediaDirector.createMedia(mediaItems);
        System.out.println(media);
    }

}
