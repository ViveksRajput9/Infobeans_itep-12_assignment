// add two 2d arrays
import java.util.Scanner;
class D4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int [r][c];
        int br[][] = new int [r][c];
        System.out.println("enter arry no");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("give the value of 2nd array");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                br[i][j] = sc.nextInt();
            }
        }
        int temp=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(ar[i][j]!=br[i][j]){
                temp=1;
                break;
                }
            }
        }
        if(temp==0){
            System.out.println("these matrix are identcal");
        }else{
            System.out.println("these matrix are not identcal");
        }
        
    }
}