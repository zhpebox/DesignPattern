package test.adaptor;

public class Client {

    public static void main(String[] args) {
        ThreePhase three = new adapterObject();
        three.showThree();

        ThreePhase threePhase = new NewAdapter(new TwoPhase());
        threePhase.showThree();
        threePhase.showThwo();
    }

}
