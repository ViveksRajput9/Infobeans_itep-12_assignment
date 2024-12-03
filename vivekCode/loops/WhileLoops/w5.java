import java.util.Scanner;
public class w5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1,n,sum =0;
        System.out.print("Enter the number to print num series :- ");
        n = scan.nextInt();
        while(i<=n){
            sum += i;
            System.out.print(i+" + " );
            i++;
        }
        System.out.println("\b\b = "+sum);
    }
}