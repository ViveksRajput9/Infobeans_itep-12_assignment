package loops.dowhile;
import java.util.Scanner;
public class do1 {
    public static void main(String[] args) {
        
        int items,quantity,netAmount=0,rate,choice;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Enter the item no :- ");
            items=scan.nextInt();
            System.out.print("Enter the quantity:- ");
            quantity = scan.nextInt();
            System.out.print("Enter the rate :- ");
            rate = scan.nextInt();
            netAmount += rate*quantity;
            System.out.println("bill detail :-  items = "+items+" quantity = "+quantity+" rate ="+rate+" amount = "+quantity*rate);
            System.out.println("Do you want to purchase another items");
            System.out.println("click 'y' for continue  'n' for generate bill");
            choice = scan.next().charAt(0);
            
        }while(choice=='y');
        System.out.println("total net amount of purchase :- "+netAmount);
    }
}
