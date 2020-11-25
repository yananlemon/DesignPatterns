package site.ilemon.designpattern.chapter22;

/**
 * <p>魔术手指,指方为圆</p>
 *
 * @author Andy.Yan
 */
public class MagicFinger implements Ball{

    private double radius;
    private static final double PI = 3.14D;

    private Cube cube;

    public MagicFinger(Cube cube) {
        this.radius = cube.getWidth();
        this.cube = cube;
    }

    /**
     * 计算面积
     *
     * @return
     */
    @Override
    public double calculateFaceArea() {
        return 4 * PI*(radius * radius);
    }

    /**
     * 计算体积
     *
     * @return
     */
    @Override
    public double calculateVolume() {
        return PI * (radius * radius * radius) * 4 / 3;
    }

    /**
     * 获取半径
     *
     * @return
     */
    @Override
    public double getRadius() {
        return this.radius;
    }

    /**
     * 设置半径
     *
     * @param radius
     * @return
     */
    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
