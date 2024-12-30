import java.util.Scanner;

class GooglePay{
    long transactionId;
    int amount;
    GooglePay(long transactionId,int amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }
    void display(){
        System.out.print(" TransactionId = "+transactionId+" : "+" Amount = "+amount+" : ");
    }
}
class PeerToPeer extends GooglePay{
    String recipient;
    PeerToPeer(long transactionId, int amount,String recipient){
        super(transactionId,amount);
        this.recipient = recipient;
    }

    void display(){
        super.display();
        System.out.println(" Recepient = "+ recipient);
    }
}
class OnlinePurchaseTransaction extends GooglePay{
    String recipient;
    OnlinePurchaseTransaction(long transactionId, int amount,String recipient){
        super(transactionId,amount);
        this.recipient = recipient;
    }
    void display(){
        super.display();
        System.out.println(" Recepient = "+ recipient);
    }
}
class BillPaymentTransaction extends GooglePay{
    String recipient;
    BillPaymentTransaction(long transactionId, int amount,String recipient){
        super(transactionId,amount);
        this.recipient = recipient;
    }
    void display(){
        super.display();
        System.out.println(" Recepient = "+ recipient);
    }
}
class bank{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------------welcome to Payment System--------------------------");
    System.out.print(" Enter the amount : ");
    int Amount = sc.nextInt();
    System.out.print(" Enter ");

  }
}
