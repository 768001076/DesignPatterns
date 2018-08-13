package net.sjl.learn.deepinshallowout.tobuild.bean.mediaelements;

/*
 * @Time:2018/7/14 下午10:01
 * @Auther:Shijielei
 * @Describe: 媒体元素
 */
public class MediaItem {

    private String name;

    public MediaItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
