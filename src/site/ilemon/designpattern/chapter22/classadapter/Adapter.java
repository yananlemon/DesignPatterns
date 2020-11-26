package site.ilemon.designpattern.chapter22.classadapter;

/**
 * <p>适配器角色,在适配器模式中,这是类的适配器的形式实现</p>
 *
 * @author Andy.Yan
 */
public class Adapter extends Adaptee implements Target{
    /**
     * 这是源类中没有的方法sampleOperation2
     */
    @Override
    public void sampleOperation2() {

    }
}
