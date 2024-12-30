import java.util.Scanner;
class Digit2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number");
        int n = sc.nextInt();
        int i, oddSum=0, rem;
        while(n>0){
            rem = n%10;
            n = n/10;
            if(rem%2!=0)oddSum+=rem;
        }
        System.out.println("sum of odd digits "+ oddSum);
    }
}