package practise;
import java.util.Scanner;
public class demo {
    public static int inputThreeDigit(){
        try(Scanner scan = new Scanner(System.in)){
            do{
                System.out.print("Enter the 3 digit number :- ");
                int digit = scan.nextInt();

                if(digit>99&&digit<1000){
                    return digit;
                }else{
                    System.out.println("oops... you put wrong value ");
                }
            }while(true);
        }
    }
    public static void findTotalEvenOddNum(long digit ) {
        int even=0,odd=0;
        while (digit!=0) {
            int c = (int)digit%10;
            digit = digit/10;
            System.out.println(digit+" dd:");
            if(c%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Total even numbers in digits "+even);
        System.out.println("Total odd numbers in digit "+ odd);
    }
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter num :- ");
            long digit = scan.nextLong();
            findTotalEvenOddNum(digit);
        }
    }
}