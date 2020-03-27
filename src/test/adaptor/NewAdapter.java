package test.adaptor;

public class NewAdapter implements ThreePhase{

    TwoPhase twoPhase ;

    public NewAdapter(TwoPhase twoPhase) {
        this.twoPhase = twoPhase;
    }

    @Override
    public void showThree() {
        System.out.println("This is three phase!");
    }

    @Override
    public void showThwo() {
        this.twoPhase.showThwo();
    }
}
