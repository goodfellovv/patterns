package subjects;

import observers.Observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

    void update(String info);
    void updateAndNotify(String info);
}
