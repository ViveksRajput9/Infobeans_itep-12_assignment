import java.util.Scanner;
public class primeNumber {
    public static boolean isPrime(int num){
        if(num < 1){
            System.out.println("only accept possitive number ");
            return false;
        }else if(num == 1){
            return true;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
              return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("welcome to print prime number series....");
        Scanner scan = new Scanner(System.in);
        int i ,n;
        System.out.print("Enter the starting number :- ");
        i = scan.nextInt();
        System.out.print("Enter the ending number :- ");
        n = scan.nextInt();
        for(;i<=n;i++){
            if(isPrime(i)){
                System.out.println( i + " prime number ");
            }
        }
    }
}