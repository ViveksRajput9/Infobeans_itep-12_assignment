// prime count
import java.util.Scanner;
class Ar4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int s = sc.nextInt();
        int ar[] = new int [s];
        int primeCount=0, flag=0;
        System.out.println("enter arry no");
        for(int i=0; i<s; i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0; i<s; i++){
            flag=0;
            for(int j=2; j<ar[i]; j++){

               if(ar[i]%j == 0){
                flag =1;
                break;
               }
            }
            if(flag==0 && ar[i]>1){
                primeCount++;
                System.out.println(ar[i]);
            }
        }
        System.out.println("prime "+primeCount);
    }
}