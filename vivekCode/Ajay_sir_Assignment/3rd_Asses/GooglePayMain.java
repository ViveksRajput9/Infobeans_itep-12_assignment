
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GooglePay {
    long transactionId;
    int amount;

    GooglePay(long transactionId, int amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    void display() {
        System.out.print(" TransactionId = " + transactionId + " : " + " Amount = " + amount + " : ");
    }
    long getTransactionId(){
        return transactionId;
    }
    int getAmount(){
        return amount;
    }
}

class PeerToPeer extends GooglePay {
    String recipient;

    PeerToPeer(long transactionId, int amount, String recipient) {
        super(transactionId, amount);
        this.recipient = recipient;
    }

    void display() {
        System.out.println("----------------- Transaction details -----------------");
        super.display();
        System.out.println(" Recepient = " + recipient);
        System.out.println("------------------------ end  ------------------------");
    }
    String getRecepient(){
        return recipient;
    }
}

class OnlinePurchaseTransaction extends GooglePay {
    String Merchant;

    OnlinePurchaseTransaction(long transactionId, int amount, String Merchant) {
        super(transactionId, amount);
        this.Merchant = Merchant;
    }

    void display() {
        System.out.println("----------------- Transaction details -----------------");

        super.display();
        System.out.println(" Merchant = " + Merchant);
        System.out.println("------------------------ end  ------------------------");

    }
    String getMerchant(){
        return Merchant;
    }
}

class BillPaymentTransaction extends GooglePay {
    String BillType;

    BillPaymentTransaction(long transactionId, int amount, String BillType) {
        super(transactionId, amount);
        this.BillType = BillType;
    }

    void display() {
        System.out.println("----------------- Transaction details -----------------");
        super.display();
        System.out.println(" Bill Type = " + BillType);
        System.out.println("------------------------ end  ------------------------");

    }
    String getBillType(){
        return BillType;
    }
}

class bank {
    public static int getAmount(Scanner sc) {
        int amount = 0;

        while (true) {
            System.out.print(" Enter the amount (up to 100000): ");
            if (sc.hasNextInt()) { // Check if the input is an integer
                // amount = Integer.parseInt(sc.nextLine());
                amount = sc.nextInt();
                if (amount > 0 && amount <= 100000) { 
                    break; 
                } else {
                    System.out.println("Invalid input. Amount must be between 1 and 100000.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric amount.");
                sc.next(); 
            }
        }
        return amount;
    }

    public static long getTransactionId(Scanner sc) {
        long transactionId = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(" Enter the transaction ID: ");
            if (sc.hasNextLong()) { // Check if the next input is a long
                transactionId = sc.nextLong();
                // transactionId = Long.parseLong(sc.nextLine());
                valid = true; 
            } else {
                System.out.println(" Invalid input! Please enter a numeric transaction ID.");
                sc.next();
            }
        }
        return transactionId;
    }

    public static GooglePay transactionChoice(Scanner sc) {
        System.out.println();
        System.out.println("--------------------------welcome to Payment System--------------------------");
        System.out.println();
        System.out.println(" Choose the one of the following options : ");
        System.out.println(" 1. Merchant : 2. Bill Type : 3. Recepient");
        byte choice;
        System.out.println();
        while (true) {
            System.out.print(" Enter your choice : ");
            if (sc.hasNextByte(4)) {
                choice = sc.nextByte();
                if (choice >= 1 && choice <= 3)
                    break;
                else
                    System.out.println("Invalid choice. Please enter a choice between 1 and 3.");
            } else {
                System.out.println("Invalid input. Please enter a valid choice.");
                sc.next();
            }
        }
        switch (choice) {
            case 1:
                sc.nextLine();
                System.out.print(" Enter the Merchant name : ");
                String merchant = sc.nextLine();
                while (!merchant.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid input. Please enter a valid name.");
                    System.out.print(" Enter the merchant name: ");
                    merchant = sc.nextLine();
                }
                return new OnlinePurchaseTransaction(getTransactionId(sc), getAmount(sc), merchant);
            case 2:
                sc.nextLine();
                System.out.print(" Enter the Bill Type : ");
                String billType = sc.nextLine();
                while (!billType.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid input. Please enter a valid name.");
                    System.out.print(" Enter the Bill Type : ");
                    billType = sc.nextLine();
                }
                return new BillPaymentTransaction(getTransactionId(sc), getAmount(sc), billType);
            case 3:
                sc.nextLine();
                System.out.print(" Enter the Recepient name : ");
                String recepient = sc.nextLine();
                while (!recepient.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid input. Please enter a valid name.");
                    System.out.print(" Enter the Recepient name : ");
                    recepient = sc.nextLine();
                }
                return new PeerToPeer(getTransactionId(sc), getAmount(sc), recepient);
            default:
                return null;
        }
    }

    public static boolean newBillChoice(Scanner sc) {
        char choice1;
        do {
            System.out.println("Do you want to generate new bill ? type y for yes and n for no");
            choice1 = sc.next().charAt(0);
            if (choice1 == 'n' || choice1 == 'N') {
                return false;
            } else if (choice1 == 'y' || choice1 == 'Y') {
                return true;
            } else {
                System.out.println("Invalid choice");
            }
        } while (true);
    }
    public static void displayAllTransactions(Scanner sc,List<GooglePay> transactions){
        System.out.println("Do you want display all transactions ? type y for yes and n for no");
        char choice2 = sc.next().charAt(0);
        if (choice2 == 'y' || choice2 == 'Y') {
            System.out.println("----------------- All Transaction details -----------------");
            System.out.println();

            for (GooglePay transaction : transactions) {
                transaction.display();
                System.out.println();
            }
            System.out.println("-------------------------- ended --------------------------");

        }
    }

    public static void main(String[] args) {
        List<GooglePay> transactions = new ArrayList<>(); // List to store transactions
        Scanner sc = new Scanner(System.in);

        do {

            GooglePay transaction = transactionChoice(sc);
            if (transaction != null) {
                transactions.add(transaction);
                transaction.display();
                System.out.println("---------------ThankYou---------------");
            }else{
                System.out.println("Invalid  bill ");
            }
        } while (newBillChoice(sc));
        displayAllTransactions(sc,transactions);
        System.out.println("Thank you for using Google Pay");
    }
}
public class GooglePayMain {
    
}
