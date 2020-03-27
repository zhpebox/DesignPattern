package test.observer;

public interface Subject {

    void register(Observer obj);
    void remove(Observer obj);
    void notifyObserverList(Object e);

}
