// perfect no count
import java.util.Scanner;
class D1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int [r][c];
        int sum=0, multi=1;
        System.out.println("enter arry no");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ar[i][j] = sc.nextInt();
                sum +=ar[i][j];
                multi *= ar[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(multi);
        
    }
}