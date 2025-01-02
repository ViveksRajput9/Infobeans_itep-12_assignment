
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
        System.out.println("----------------- Transaction details -----------------");
        System.out.print(" TransactionId = " + transactionId + " : " + " Amount = " + amount + " : ");
    }
}

class PeerToPeer extends GooglePay {
    String recipient;

    PeerToPeer(long transactionId, int amount, String recipient) {
        super(transactionId, amount);
        this.recipient = recipient;
    }

    void display() {
        super.display();
        System.out.println(" Recepient = " + recipient);
        System.out.println("------------------------ end  ------------------------");
    }
}

class OnlinePurchaseTransaction extends GooglePay {
    String Merchant;

    OnlinePurchaseTransaction(long transactionId, int amount, String Merchant) {
        super(transactionId, amount);
        this.Merchant = Merchant;
    }

    void display() {
        super.display();
        System.out.println(" Merchant = " + Merchant);
        System.out.println("------------------------ end  ------------------------");

    }
}

class BillPaymentTransaction extends GooglePay {
    String BillType;

    BillPaymentTransaction(long transactionId, int amount, String BillType) {
        super(transactionId, amount);
        this.BillType = BillType;
    }

    void display() {
        super.display();
        System.out.println(" Bill Type = " + BillType);
        System.out.println("------------------------ end  ------------------------");

    }
}

<<<<<<< HEAD:vivekCode/oops/Inhertance/Bank.java
public class Bank {
    public static int getAmount() {
        int amount = 0;
        try (Scanner sc1 = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the amount (up to 100000): ");
                if (sc1.hasNextInt()) { // Check if the input is an integer
                    amount = sc1.nextInt();
                    if (amount > 0 && amount <= 100000) { // Validate the range
                        break; // Exit loop if valid
                    } else {
                        System.out.println("Invalid input. Amount must be between 1 and 100000.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric amount.");
                    sc1.next(); // Clear the invalid input
=======
class bank {
    public static int getAmount(Scanner sc) {
        int amount = 0;

        while (true) {
            System.out.print(" Enter the amount (up to 100000): ");
            if (sc.hasNextInt()) { // Check if the input is an integer
                // amount = Integer.parseInt(sc.nextLine());
                amount = sc.nextInt();
                if (amount > 0 && amount <= 100000) { // Validate the range
                    break; // Exit loop if valid
                } else {
                    System.out.println("Invalid input. Amount must be between 1 and 100000.");
>>>>>>> fa544aa81febfa3902a338b12ba91e71086d33e3:vivekCode/oops/Inhertance/bank.java
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric amount.");
                sc.next(); // Clear the invalid input
            }
        }
        return amount;
    }
<<<<<<< HEAD:vivekCode/oops/Inhertance/Bank.java
    
    public static long getTransactionId() {
=======

    public static long getTransactionId(Scanner sc) {
>>>>>>> fa544aa81febfa3902a338b12ba91e71086d33e3:vivekCode/oops/Inhertance/bank.java
        long transactionId = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(" Enter the transaction ID: ");
            if (sc.hasNextLong()) { // Check if the next input is a long
                transactionId = sc.nextLong();
                // transactionId = Long.parseLong(sc.nextLine());
                valid = true; // Exit the loop if input is valid
            } else {
                System.out.println(" Invalid input! Please enter a numeric transaction ID.");
                sc.next(); // Clear the invalid input
            }
        }
        return transactionId;
    }

    public static void transactionChoice(Scanner sc, List<GooglePay> transactions) {
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
        GooglePay transaction = null;
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
                transaction = new OnlinePurchaseTransaction(getTransactionId(sc), getAmount(sc), merchant);
                transaction.display();
                System.out.println("---------------ThankYou---------------");
                break;
            case 2:
                sc.nextLine();
                System.out.print(" Enter the Bill Type : ");
                String billType = sc.nextLine();
                while (!billType.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid input. Please enter a valid name.");
                    System.out.print(" Enter the Bill Type : ");
                    billType = sc.nextLine();
                }
                transaction = new BillPaymentTransaction(getTransactionId(sc), getAmount(sc), billType);
                transaction.display();
                System.out.println("---------------ThankYou---------------");
                break;
            case 3:
                sc.nextLine();
                System.out.print(" Enter the Recepient name : ");
                String recepient = sc.nextLine();
                while (!recepient.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid input. Please enter a valid name.");
                    System.out.print(" Enter the Recepient name : ");
                    recepient = sc.nextLine();
                }
                transaction = new PeerToPeer(getTransactionId(sc), getAmount(sc), recepient);
                transaction.display();
                System.out.println("---------------ThankYou---------------");
            default:
                System.out.println("Invalid choice");
        }
        if (transaction != null) {
            transactions.add(transaction);
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

    public static void main(String[] args) {
        List<GooglePay> transactions = new ArrayList<>(); // List to store transactions
<<<<<<< HEAD:vivekCode/oops/Inhertance/Bank.java
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("--------------------------welcome to Payment System--------------------------");

                System.out.print(" Choose the one of the following options : \n");
                System.out.println(" 1. Merchant : 2. Bill Type : 3. Recepient");
                byte choice;
                while(true){
                    System.out.print(" Enter your choice : ");
                    if (sc.hasNextByte(3)){
                        choice = sc.nextByte();
                        if(choice >= 1 && choice <= 3)break;
                        else System.out.println("Invalid choice. Please enter a choice between 1 and 3.");
                    }else{
                        System.out.println("Invalid input. Please enter a valid choice.");
                        sc.next();
                    }
                }
                int flage = 0;
                GooglePay transaction = null;
                do {
                    switch (choice) {
                        case 1:
                            System.out.print(" Enter the Merchant name : ");
                            String Merchant = sc.next();
                            int amount = getAmount();
                            long transactionId = getTransactionId();
                            transaction = new OnlinePurchaseTransaction(transactionId,amount,Merchant);
                            transaction.display();
                            System.out.println("---------------ThankYou---------------");
                            break;
                        case 2:
                            System.out.print(" Enter the Bill Type : ");
                            String BillType = sc.next();
                            
                            transaction = new BillPaymentTransaction(getTransactionId(), getAmount(), BillType);
                            transaction.display();
                            System.out.println("---------------ThankYou---------------");
                            break;
                        case 3:
                            System.out.print(" Enter the Recepient name : ");
                            String recepient = sc.next();
                            transaction = new PeerToPeer(getTransactionId(),getAmount(), recepient);
                            transaction.display();
                            System.out.println("---------------ThankYou---------------");
                        default:
                            flage = 1;
                            System.out.println("Invalid choice");
                    }
                    if(transaction!=null){
                        transactions.add(transaction);
                    }
                } while (flage == 0);
                char choice1;
                do {
                    System.out.println("Do you want to generate new bill ? type y for yes and n for no");
                    choice1 = sc.next().charAt(0);
                    if (choice1 == 'n' || choice1 == 'N') {
                        break;
                    } else if (choice1 == 'y' || choice1 == 'Y') {
                        break;
                    } else {
                        System.out.println("Invalid choice");
                    }
                } while (true);
                if (choice1 == 'n' || choice1 == 'N')
                    break;
            } while (true);
            System.out.println("Do you want display all transactions ? type y for yes and n for no");
            char choice2 = sc.next().charAt(0);
            if(choice2=='y'||choice2=='Y'){
=======
        Scanner sc = new Scanner(System.in);
>>>>>>> fa544aa81febfa3902a338b12ba91e71086d33e3:vivekCode/oops/Inhertance/bank.java

        do {

            transactionChoice(sc, transactions);

        } while (newBillChoice(sc));
        System.out.println("Do you want display all transactions ? type y for yes and n for no");
        char choice2 = sc.next().charAt(0);
        if (choice2 == 'y' || choice2 == 'Y') {

            for (GooglePay transaction : transactions) {
                transaction.display();
                System.out.println();
            }
        }
        System.out.println("Thank you for using Google Pay");
    }
}