// factorial of arrays no
import java.util.Scanner;
class Ar10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, fact=1;
        int ar [] = new int[n];
        for(i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            fact=1;
           for(int j=2; j<=ar[i]; j++){
            fact = fact*j;
           }
            System.out.println("["+ar[i] + "]= " + fact);
        }
    }
}