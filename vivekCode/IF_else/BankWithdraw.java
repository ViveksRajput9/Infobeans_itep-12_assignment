import java.util.Scanner;
class BankWithdraw{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in); 
        int balance = 1000;
        System.out.println("Enter amount to withdraw :- ");
        int amount= scan.nextInt();
        if(amount<=balance){
            if(amount%10==0){
                System.out.println(" Congratulation amount withdraw successfull :- " + amount);
            }
        }else{
            
        }

    }
}