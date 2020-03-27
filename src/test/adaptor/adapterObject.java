package test.adaptor;

public class adapterObject extends TwoPhase implements ThreePhase {
    @Override
    public void showThree() {
        System.out.println("This is Three Phase!");
    }

    @Override
    public void showThwo() {
        super.showThwo();
    }
}
