package test.decorator;

public class Light extends Peijian {


    public Light(Compent decorotr) {
        super(decorotr);
    }

    @Override
    public int cost() {
        return decorotr.cost()+3;
    }

    @Override
    public String describe() {
        return decorotr.describe() + " ¼Ð²ãµÆ ";
    }
}
