import java.util.Scanner;
class EvenOdd{
    public static void main(String ar[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to find even odd Number");
        System.out.print("Enter no :-  ");
        int input = scan.nextInt();
        if(input%2==0){
            System.out.println("it is even ");

        }else{
            System.out.println("it is odd");
        }
    }
}