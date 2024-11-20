import java.util.Scanner;
public class g5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num :- ");
        int num = scan.nextInt();
        if(num%11==0){
            System.out.println("Num is divisible by 11");
        }else{
            System.out.println("No it's not divisible by 11");
        }
    }
}