package task2;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String name;
    private List<Observer> observers;

    public Topic(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void sendMessage(String sender, String message) {
        for (Observer observer : observers) {
            observer.update(sender, name, message);
        }
    }
}