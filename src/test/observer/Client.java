package test.observer;

public class Client {
    public static void main(String[] args) {

        Father father = new Father();
        Child one = new Child("one");
        Child two = new Child("two");
        Child third = new Child("third");

        father.register(one);
        father.register(two);
        father.register(third);

        father.notifyObserverList("we are family!");

        one.show();
        two.show();
        third.show();

        father.remove(two);

        father.notifyObserverList("we are happy!");

        one.show();
        two.show();
        third.show();



    }
}
