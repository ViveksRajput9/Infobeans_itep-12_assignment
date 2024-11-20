import java.util.Scanner;

public class g7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num :- ");
        int num = scan.nextInt();
        if(num%3==0&&num%5==0){
            System.out.println("Num is divisible by 3 and 5");
        }else{
            System.out.println("this num Not divisible by 3 and 5");
        }
    }
}
