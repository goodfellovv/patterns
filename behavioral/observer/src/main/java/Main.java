import observers.BinaryObserver;
import observers.HexaObserver;
import observers.Observer;
import observers.OctalObserver;
import subjects.Subject;
import subjects.SubjectImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        System.out.println("**************Init observers**************");
        List<Observer> observers = Arrays.asList(new HexaObserver("16"), new OctalObserver("8"), new BinaryObserver("2"));
        observers.forEach(Observer::print);
        observers.forEach(subject::register);
        System.out.println("******************************************\n");

        System.out.println("**************Update observers**************");
        subject.update("9999");
        observers.forEach(Observer::print);
        System.out.println("******************************************\n");

        System.out.println("**************Notify observers**************");
        subject.notifyObservers();
        observers.forEach(Observer::print);
        System.out.println("******************************************\n");

        System.out.println("**************Update And Notify observers**************");
        subject.updateAndNotify("8888");
        observers.forEach(Observer::print);
        System.out.println("******************************************\n");

        System.out.println("******************Stop*******************");
        observers.forEach(subject::unregister);
        System.out.println("******************************************\n");
    }
}
