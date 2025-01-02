import java.util.Scanner;

class GooglePay{
    long transactionId;
    int amount;
    GooglePay(long transactionId,int amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }
    void display(){
        System.out.println("----------------- Transaction details -----------------");
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
        System.out.println("------------------------ end  ------------------------");
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
        System.out.println("------------------------ end  ------------------------");

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
        System.out.println("------------------------ end  ------------------------");

    }
}
class bank1{
  public static void main(String[] args) {
    do{

        try( Scanner sc = new Scanner(System.in)){
            
            System.out.println("--------------------------welcome to Payment System--------------------------");
            System.out.print(" Enter the amount : ");
            int Amount = sc.nextInt();
            System.out.print(" Enter the transaction Id : ");
            long transactionId = sc.nextLong();
            
            System.out.print(" Choose the ");
        }
    }while()

  }
}
