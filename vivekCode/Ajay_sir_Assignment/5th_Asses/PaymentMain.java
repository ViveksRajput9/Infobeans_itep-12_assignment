abstract class Payment{
    protected double amount;
    String transactionId;
    Payment(double amount , String transactionId){
        this.amount = amount;
        this.transactionId = transactionId;
    }
    abstract void processPayment();
    void displayDetails(){
        System.out.println("TransactionId : "+transactionId + " , Amount : "+amount);
    }
}
class CreditCardPayment extends Payment
{
    String cardNumber;
    CreditCardPayment(double amount, String cardNumber,String transactionId){
        super(amount,transactionId);
        this.cardNumber = cardNumber;
    }
    void processPayment(){
        System.out.println("Processing creditCard payment for amount : "+amount);
    }
}
class PaypalPayment extends Payment
{
    String paypalId;
    PaypalPayment(double amount ,String paypalId, String transactionId){
        super(amount, transactionId);
        this.paypalId=paypalId;

    }
    void processPayment(){
        System.out.println("Processing Paypal payment for amount : "+amount);
    }
}
public class PaymentMain {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(10000,"4165454164", "CA32168543");
        Payment p2 = new PaypalPayment(15000,"64165463184","PAP4165485");
        p1.processPayment();
        p1.displayDetails();
        p2.processPayment();
        p2.displayDetails();
    }
}
