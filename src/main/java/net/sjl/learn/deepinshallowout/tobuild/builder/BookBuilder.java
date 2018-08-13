package net.sjl.learn.deepinshallowout.tobuild.builder;

import net.sjl.learn.deepinshallowout.tobuild.bean.media.Book;
import net.sjl.learn.deepinshallowout.tobuild.bean.media.Media;
import net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements.MediaItem;

/*
 * @Time:2018/7/14 下午10:09
 * @Auther:Shijielei
 * @Describe: 书籍具体建造者
 */
public class BookBuilder implements MediaBuilder {

    private Book book;

    public void buildBase() {
        System.out.println("BookBuilder BuildBase: Book");
        book = new Book();
    }

    public void addMediaElements(MediaItem mediaItem) {
        System.out.println("BookBuilder AddMediaElements: " + mediaItem);
        book.add(mediaItem);
    }

    public Media getFinshedMedia() {
        return book;
    }
}
