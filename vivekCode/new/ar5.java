// perfect no count
import java.util.Scanner;
class Ar5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int s = sc.nextInt();
        int ar[] = new int [s];
        int pftCount=0, flag=0;
        System.out.println("enter arry no");
        for(int i=0; i<s; i++){
            ar[i] = sc.nextInt();
        }
        for(int x:ar){
            flag=0;
            for(int j=1; j<x; j++){
                if(x%j==0){
                    flag = flag + j;

                }
            }
            if(flag == x){
                System.out.println(x+" is perfect no");
            }
        }
    }
}