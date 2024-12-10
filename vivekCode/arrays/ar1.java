package arrays;
import java.util.Scanner;

public class ar1 {
    public static void main(String[] args) {
        int sum =0;
        int sumOfEven=0,sumOfOdd=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        
        int ar[] = new int[size];
        System.out.println("Enter "+size+ " elements...");
        for(int i = 0;i<size;i++){
            System.out.print("Enter the value "+i+ " :-");
            ar[i]=scan.nextInt();
            sum += ar[i];
            if(ar[i]%2==0){
                sumOfEven+=ar[i];
            }else{
                sumOfOdd +=ar[i];
            }
            sum += ar[i];
        }
        System.out.println("sum of all elements = ");
        System.out.println("Even :- "+ sumOfEven);
        System.out.println("Odd :- "+ sumOfOdd);
        System.out.println("Total sum :- "+sum);
    }
}