package site.ilemon.designpattern.chapter22;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
public interface Ball {

    /**
     * 计算面积
     * @return
     */
    double calculateFaceArea();

    /**
     * 计算体积
     * @return
     */
    double calculateVolume();

    /**
     * 获取半径
     * @return
     */
    double getRadius();

    /**
     * 设置半径
     * @return
     */
    void setRadius(double radius);

}
