
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class for all transactions
abstract class GooglePayTransaction {
    private long transactionId;
    private int amount;

    public GooglePayTransaction(long transactionId, int amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public abstract void display(); // Abstract method for displaying transaction details
}

// Subclass for Peer-to-Peer transactions
class PeerToPeerTransaction extends GooglePayTransaction {
    private String recipient;

    public PeerToPeerTransaction(long transactionId, int amount, String recipient) {
        super(transactionId, amount);
        this.recipient = recipient;
    }

    @Override
    public void display() {
        System.out.println("----------------- Transaction details -----------------");
        System.out.println("TransactionId = " + getTransactionId() + " : Amount = " + getAmount() + " : Recipient = " + recipient);
        System.out.println("------------------------ end ------------------------");
    }
}

// Subclass for Online Purchase transactions
class OnlinePurchaseTransaction extends GooglePayTransaction {
    private String merchant;

    public OnlinePurchaseTransaction(long transactionId, int amount, String merchant) {
        super(transactionId, amount);
        this.merchant = merchant;
    }

    @Override
    public void display() {
        System.out.println("----------------- Transaction details -----------------");
        System.out.println("TransactionId = " + getTransactionId() + " : Amount = " + getAmount() + " : Merchant = " + merchant);
        System.out.println("------------------------ end  ------------------------");
    }
}

// Subclass for Bill Payment transactions
class BillPaymentTransaction extends GooglePayTransaction {
    private String billType;

    public BillPaymentTransaction(long transactionId, int amount, String billType) {
        super(transactionId, amount);
        this.billType = billType;
    }

    @Override
    public void display() {
        System.out.println("----------------- Transaction details -----------------");
        System.out.println("TransactionId = " + getTransactionId() + " : Amount = " + getAmount() + " : Bill Type = " + billType);
        System.out.println("------------------------ end  ------------------------");
    }
}

// Main class to handle transactions
public class bank {
    private static int getAmount(Scanner sc) {
        int amount = 0;
        while (true) {
            System.out.print("Enter the amount (up to 100000): ");
            if (sc.hasNextInt()) {
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

    private static long getTransactionId(Scanner sc) {
        long transactionId = 0;
        while (true) {
            System.out.print("Enter the transaction ID: ");
            if (sc.hasNextLong()) {
                transactionId = sc.nextLong();
                break;
            } else {
                System.out.println("Invalid input! Please enter a numeric transaction ID.");
                sc.next();
            }
        }
        return transactionId;
    }

    private static GooglePayTransaction createTransaction(Scanner sc) {
        System.out.println("Choose one of the following options:");
        System.out.println("1. Merchant Transaction");
        System.out.println("2. Bill Payment Transaction");
        System.out.println("3. Peer-to-Peer Transaction");

        byte choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (sc.hasNextByte()) {
                choice = sc.nextByte();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a choice between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid choice.");
                sc.next();
            }
        }

        sc.nextLine(); // Consume newline
        String name;
        switch (choice) {
            case 1:
                System.out.print("Enter the Merchant name: ");
                name = sc.nextLine();
                return new OnlinePurchaseTransaction(getTransactionId(sc), getAmount (sc), name);
            case 2:
                System.out.print("Enter the Bill Type: ");
                name = sc.nextLine();
                return new BillPaymentTransaction(getTransactionId(sc), getAmount(sc), name);
            case 3:
                System.out.print("Enter the Recipient name: ");
                name = sc.nextLine();
                return new PeerToPeerTransaction(getTransactionId(sc), getAmount(sc), name);
            default:
                return null; // This should never happen due to previous validation
        }
    }

    private static boolean newBillChoice(Scanner sc) {
        char choice;
        do {
            System.out.println("Do you want to generate a new bill? Type 'y' for yes and 'n' for no:");
            choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                return false;
            } else if (choice == 'y' || choice == 'Y') {
                return true;
            } else {
                System.out.println("Invalid choice");
            }
        } while (true);
    }

    public static void main(String[] args) {
        List<GooglePayTransaction> transactions = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            GooglePayTransaction transaction = createTransaction(sc);
            if (transaction != null) {
                transaction.display();
                transactions.add(transaction);
                System.out.println("--------------------- Thank You ---------------------");
            }
        } while (newBillChoice(sc));

        System.out.println("Do you want to display all transactions? Type 'y' for yes and 'n' for no:");
        char choice = sc.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            for (GooglePayTransaction transaction : transactions) {
                transaction.display();
                System.out.println();
            }
        }
        System.out.println("Thank you for using Google Pay");
    }
}