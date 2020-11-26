package site.ilemon.designpattern.chapter22.classadapter;

/**
 * <p>目标接口,在适配器模式中代表着源需要适配的接口.</p>
 *
 * @author Andy.Yan
 */
public interface Target {

    /**
     * 这是源类中也有的方法sampleOperation1
     */
    void sampleOperation1();

    /**
     * 这是源类中没有的方法sampleOperation2
     */
    void sampleOperation2();
}
