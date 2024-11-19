import java.util.Scanner;
class MultipleOfNum{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start value :- ");
        int start = scan.nextInt();
        System.out.print("Enter end value :- ");
        int end = scan.nextInt();
        while(start<=end){
            if(start%7==0){
                System.out.println("multiple of 7 is :- "+ start);
                start += 7;
            }else{
                start++;
                System.out.println(" No ");
            }
        }
        scan.close();
    }
} 
