import java.util.Scanner;
public class w6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =1,n;
        float sum = 0f;
        System.out.print("Enter the num to print series");
        n = scan.nextInt();
  
        while(i<=n){
            sum +=1.0f/i;
            System.out.print(1.0f+"/"+i + " + ");
            i++;
        }
        System.out.print("\b\b = "+sum);
    }
}