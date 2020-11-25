package site.ilemon.designpattern.chapter22;

/**
 * <p>立方体类</p>
 *
 * @author Andy.Yan
 */
public class Cube {
    private double width;

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 计算体积
     * @return
     */
    public double calculateVolume() {
        return this.width * this.width * this.width;
    }

    /**
     * 计算体积
     * @return
     */
    public double calculateFaceArea() {
        return this.width * this.width;
    }
}
