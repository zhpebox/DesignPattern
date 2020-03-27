package test.decorator;

public class Car implements Compent {

    int cost = 10;

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String describe() {
        return " this is a car !";
    }
}
