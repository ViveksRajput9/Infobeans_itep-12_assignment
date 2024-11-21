import java.util.Scanner;
class CheckTemperature{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in celsius:- ");
        int temp= scan.nextInt();
        if(temp<0){
            System.out.println("Freezing...");
        }else if(temp<=15){
            System.out.println("cold");
        }else if(temp<30){
            System.out.println("warm");
        }else{
            System.out.println("Hot");
        }
    }
}