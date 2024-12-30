// odd sum and even sum
import java.util.Scanner;
class Ar3{
    public static void main(String args[]){
        int oddCont = 0, evenCont=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int s = sc.nextInt();
        int ar[] = new int [s];
        System.out.println("enter arry no");
        for(int i=0; i<s; i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0; i<s; i++){
            if(ar[i]%2==0){
                evenCont++;
            }else {
                oddCont++;
            }
        }
        System.out.println("odd "+oddCont);
        System.out.println("even "+evenCont);
    }
}