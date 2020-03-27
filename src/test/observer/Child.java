package test.observer;

public class Child implements Observer {

    String local;

    Object getFromFather;

    public Child(String local) {
        this.local = local;
    }

    @Override
    public void updateInfo(Object obj) {
        this.getFromFather = obj;
    }

    @Override
    public void show() {
        System.out.println("this is "+local+"; father is [{"+getFromFather.toString()+"}]");
    }
}
