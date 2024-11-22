import java.util.Scanner;
class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the No :- ");
        int num = scan.nextInt();
        if(num>=100&&num<=999){
            if(num%2==0){
                System.out.println(" Even Number ");
            }else{
                System.out.println("Odd Number");
            }
        }else{
            System.out.println("Please Enter number between 100 to 999");
        }
    }
}