package task3;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Plată cash în valoare de " + amount + " RON.");
    }
}
