import java.util.Scanner;
class SwapNumber{
    public static void main(String ar[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st no :-");
        int a = scan.nextInt();

        System.out.print("Enter 2nd no :-");
        int b = scan.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("1st :-  "+a);
        System.out.println("2nd :-  "+b);    
    }
}