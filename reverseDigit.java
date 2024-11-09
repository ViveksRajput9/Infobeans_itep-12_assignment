import java.util.Scanner;
class reverseDigit{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int digit = 543 , reverseDigit=0;
        int lastDigit,sum=0;
        System.out.println("hello");
        while(digit!=0){
            lastDigit = digit%10;
            System.out.println("lastdigit "+lastDigit);
            digit = digit/10;
            System.out.println("digit "+digit);
            sum += lastDigit; 
            System.out.println("sum :- "+ sum);
            lastDigit = lastDigit*10;
            reverseDigit += lastDigit;
            reverseDigit += reverseDigit/10;
            System.out.println(reverseDigit+"\n");
        }
        System.out.println(reverseDigit);
    }
}