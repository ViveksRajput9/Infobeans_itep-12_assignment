package Jan29;
class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
class NegativeDepositException extends RuntimeException{
	public NegativeDepositException(String msg) {
		super(msg);
	}
}
class BankAccount{
	private long accountNumber;
	private String accountName;
	private double balance;
	public BankAccount(long accountNumber, String accountName, int balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		try {
			if(amount<0) throw new NegativeDepositException("Invalid deposit : amount should not be negative");
			this.balance += amount;
		} catch (NegativeDepositException e) {
			System.out.println(e.getMessage());
		}
	}
	public void withdraw(double amount) {
		try {
			if(amount>this.balance) throw new InsufficientBalanceException("Insufficient balance");
			 this.balance -= amount;
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Q4 {
	public static void main(String ar[]) {
		BankAccount account = new BankAccount(68765168765l, "vivek singh rajput",51000);
		account.deposit(-1500);
		account.withdraw(1000000);
	}
}