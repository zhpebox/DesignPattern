package test.decorator;

public abstract class Peijian  implements Compent {

    Compent decorotr ;

    public Peijian(Compent decorotr) {
        this.decorotr = decorotr;
    }

}
