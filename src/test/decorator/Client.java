package test.decorator;

public class Client {
    public static void main(String[] args) {
        Compent car = new Car();

        Compent light = new Light(car);
        Compent w = new Window(light);

        System.out.println(w.cost());
        System.out.println(w.describe());


    }
}
