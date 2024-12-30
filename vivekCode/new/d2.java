// even count oddcount
import java.util.Scanner;
class D2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int [r][c];
        int oddCount=0, evenCount=0;
        System.out.println("enter arry no");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ar[i][j] = sc.nextInt();
                if(ar[i][j]%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println("even "+ evenCount);
        System.out.println("odd "+ oddCount);
    }
}