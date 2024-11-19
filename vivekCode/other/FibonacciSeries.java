import java.util.Scanner;
class FibonacciSeries{
    public static void main(String ar[]){


        Scanner vivek = new Scanner(System.in);

        System.out.println("Welcome to Fibonacci series ");
        System.out.print("Enter No :- ");
        
        int n = vivek.nextInt();
                   
        int a=0 , b=1 , c = 0 ;
        for(int i =0;i<=n;i++){
            System.out.println(c);
            
             c = a + b;
             a = b;
             b = c;

        }
    }
} 