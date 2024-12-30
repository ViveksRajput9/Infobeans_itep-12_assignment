// add two 2d arrays
import java.util.Scanner;
class D3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int [r][c];
        int br[][] = new int [r][c];
        int cr[][] = new int [r][c];
        int sum=0, multi=1;
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
        System.out.println("Answer");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                cr[i][j] = ar[i][j]+br[i][j];
                System.out.println(cr[i][j]);
            }
        }
        
    }
}