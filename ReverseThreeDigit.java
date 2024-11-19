import java.util.Scanner;
class ReverseThreeDigit{
    public static void main(String ar[]){
        int n , r, l,f,s;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n<1000&&n>99){
            f = n/100;
            s = (n%100)/10;
            l = n%10;
            r = (l*100)+(s*10+f);
            System.out.println(r);
        }
    }
}