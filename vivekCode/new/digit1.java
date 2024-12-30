import java.util.Scanner;
class Digit1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number");
        int n = sc.nextInt();
        int i, count=0, rem;
        while(n>0){
            rem = n%10;
            n = n/10;
            count++;
        }
        System.out.println("number of didits"+count);
    }
}