import java.util.Scanner;

public class g6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num :- ");
        int num = scan.nextInt();
        if(num%13==0){
            System.out.println("Num is divisible by 13");
        }else if(num%15==0){
            System.out.println("Num is divisible by 15");
        }else{
            System.out.println("No it's not divisible by 13 or 15");
        }
    }
}
