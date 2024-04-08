package task3;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Plată cu cardul în valoare de " + amount + " RON.");
    }
}
