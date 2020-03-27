package test.decorator;

public class Window extends Peijian {

    public Window(Compent decorotr) {
        super(decorotr);
    }

    @Override
    public int cost() {
        return decorotr.cost()+5;
    }

    @Override
    public String describe() {
        return decorotr.describe() + " ¼Ð²ã´°»§ ";
    }
}
