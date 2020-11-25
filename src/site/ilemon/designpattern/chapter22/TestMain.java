package site.ilemon.designpattern.chapter22;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
public class TestMain {
    public static void main(String[] args) {
        // 有一个正立方体,宽度为6
        Cube cube = new Cube(6.0D);

        // 利用魔术手指将其指方为圆
        Ball magicFinger = new MagicFinger(cube);
        System.out.println("表面积：" + magicFinger.calculateFaceArea());
        System.out.println("体积：" + magicFinger.calculateVolume());
    }
}
