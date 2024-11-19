import java.util.Scanner;
class leapYear{
    public static void main(String ar[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to find leap year");
        System.out.print("Enter year :-");
        int inputYear= scan.nextInt();
    
        if((inputYear%10==0&&(inputYear/10)%10==0&&inputYear%400==0)){
            System.out.println(inputYear +" is a leap year ");

        }else if((inputYear%10!=0||(inputYear/10)%10!=0)&& inputYear%4==0){
            System.out.println(inputYear +" is a leap year ");
        }else{
            System.out.println(inputYear+" is not a leap year ");
        }
    }
}