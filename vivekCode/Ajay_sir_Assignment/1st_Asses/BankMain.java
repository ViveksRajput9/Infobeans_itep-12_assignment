
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(String accountHolderName , String accountNumber , double balance ){
        this.accountNumber=accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    } BankAccount(String accountHolderName , String accountNumber){
        this.accountNumber=accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }
    BankAccount(BankAccount object){
        this.accountNumber = object.accountNumber;
        this.accountHolderName = object.accountHolderName;
        this.balance = object.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    void displayAccountDetails(){
        System.out.println(" AccountHolderName :- "+accountHolderName);
        System.out.println(" AccountNumber :- "+ accountNumber);
        System.out.println(" Balance :- "+balance);
    }

}

public class BankMain {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("vivek rajput "," 12345",500);
        a1.displayAccountDetails();
        BankAccount a2 = new BankAccount(a1);
        a2.setBalance(1500);
        a2.displayAccountDetails();
    }
    
}
