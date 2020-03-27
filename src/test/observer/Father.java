package test.observer;

import java.util.ArrayList;

public class Father implements  Subject{

    private ArrayList<Observer> childrenList;

    public Father() {
        childrenList = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        this.childrenList.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        this.childrenList.remove(obj);
    }

    @Override
    public void notifyObserverList(Object obj) {
        childrenList.forEach(e->{e.updateInfo(obj);});
    }


}
