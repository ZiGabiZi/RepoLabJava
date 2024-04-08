package task2;

interface Observer {
    void update(String sender, String topic, String message);
}

public class Clienti implements Observer {
    private String name;

    public Clienti(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String sender, String topic, String message) {
        if (!sender.equals(name)) {
            System.out.println("[" + name + "] " + sender + " @ " + topic + ": " + message);
        }
    }
}