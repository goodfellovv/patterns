package subjects;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    protected List<Observer> observers;
    protected String data;

    public SubjectImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        System.out.println("Register observer: " + observer.name());
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("Unregister observer: " + observer.name());
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this.data));
    }

    @Override
    public void update(String data) {
        System.out.println("Update subject data: " + data);
        this.data = data;
    }

    @Override
    public void updateAndNotify(String data) {
        System.out.println("Update subject data and notify: " + data);
        this.data = data;
        notifyObservers();
    }
}
