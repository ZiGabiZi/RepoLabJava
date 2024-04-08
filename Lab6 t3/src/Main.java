import task3.*;

public class Main {
    public static void main(String[] args) {
        PaymentMethod cash = new CashPayment();
        PaymentMethod bankTransfer = new BankTransferPayment();
        PaymentMethod card = new CardPayment();

        Client client1 = new Client(cash);
        Client client2 = new Client(bankTransfer);
        Client client3 = new Client(card);


        Store store = new Store();
        store.addTransaction(client1);
        store.addTransaction(client2);
        store.addTransaction(client3);

        // Executarea tranzacțiilor
        store.executeTransactions();
    }
}