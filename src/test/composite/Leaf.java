package test.composite;

public class Leaf implements Component {

    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void dispaly(int i) {
        System.out.println("this is a leaf "+i +" name = "+name);
    }

    @Override
    public void addChild(Component c) {
        System.out.println("Error!");
    }

    @Override
    public void removeChild(Component c) {
        System.out.println("Error!");

    }
}
