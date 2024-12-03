import java.util.Scanner;
public class pt26 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(i==j||10-i==j)
                System.out.print("x");
                else
                  System.out.print(" ");
            }
            System.out.println();
        }

    }
}