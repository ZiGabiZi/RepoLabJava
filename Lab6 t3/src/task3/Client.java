package task3;
public class Client {
    private PaymentMethod paymentMethod;

    public Client(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void makeTransaction(double amount) {
        if (paymentMethod != null) {
            paymentMethod.pay(amount);
        } else {
            System.out.println("Clientul nu a specificat o metodă de plată.");
        }
    }
}