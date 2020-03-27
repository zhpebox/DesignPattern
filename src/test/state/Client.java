package test.state;

public class Client {

    public static void main(String[] args) {

        Context context = new Context(199,2);
        for (int i = 0; i < 10; i++) {
            context.deductionScore();
            context.lotteryDra();
            context.receivePrice();
            System.out.println("====================");
        }
    }

}
