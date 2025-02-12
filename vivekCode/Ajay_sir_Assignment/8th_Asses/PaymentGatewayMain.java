package vivekCode;

interface PaymentGateway{
	void processPayment(double amount);
	
}
class CreditCard implements PaymentGateway
{
	public void processPayment(double amount){
		System.out.println("CrediCard Payment Processing Rs. "+amount);
	}
	
	
}
class UpiPayment implements PaymentGateway
{
	public void processPayment(double amount) {
		System.out.println("Upi Payment Processing Rs. " + amount);
	}
}
public class PaymentGatewayMain {
	public static void main(String[] args) {
		PaymentGateway p = new CreditCard();
		p.processPayment(15000);
		PaymentGateway p1 = new UpiPayment();
		p1.processPayment(10000);
	}
}
