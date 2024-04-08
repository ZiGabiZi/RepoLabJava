package task3;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Client> transactions = new ArrayList<>();

    public void addTransaction(Client client) {
        transactions.add(client);
    }

    public void executeTransactions() {
        for (Client client : transactions) {
            client.makeTransaction(100.0);
        }
        transactions.clear();
    }
}
