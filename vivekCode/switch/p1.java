//Java Program to Find Season Using Switch Statement.
import java.util.Scanner;
class p1{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter month :- ");
        int month = scan.nextInt(); 
        switch(month){
            case 11:
            case 12:
            case 1:
            case 2:System.out.println("Winter season");break;
            case 3:
            case 4:
            case 5:System.out.println("Summer season");break;
            default:System.out.println("hello");break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:System.out.println("Rainy season");break; 
            
            // default:System.out.println("invalid month");
        }
    }
}