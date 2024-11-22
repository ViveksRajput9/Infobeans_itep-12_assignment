import java.util.Scanner;
public class g2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age :- ");
        byte age = scan.nextByte();
        if(age>=18){
            System.out.println("Congratulation you are eligible for voting ");
        }else if(age>0){
            System.out.println("You are not eligible for Voting ");
        }else{
            System.out.println("Enter valid Age ");
        }
    
    }
}
