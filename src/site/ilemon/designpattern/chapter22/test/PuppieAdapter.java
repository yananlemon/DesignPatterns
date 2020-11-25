package site.ilemon.designpattern.chapter22.test;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
public class PuppieAdapter implements Puppie{
    private Kittie kittie;
    public  PuppieAdapter(Kittie kittie) {
        this.kittie = kittie;
    }

    @Override
    public void wao() {
        System.out.println("像小狗那样waowao叫");
        this.kittie.miao();
    }

    @Override
    public void fetchBall() {

    }

    @Override
    public void run() {
        this.kittie.run();
    }

    @Override
    public void sleep() {

    }
}
