package task3;

public class BankTransferPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Plată prin transfer bancar în valoare de " + amount + " RON.");
    }
}
