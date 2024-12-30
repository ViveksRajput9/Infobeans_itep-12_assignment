import java.util.Scanner;
class Digit3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give a number");
        int n = sc.nextInt();
        int num = n;
        int i, count=0, rem, sum=1, f, s, t, forth;
        while(n>0){
            rem = n%10;
            n = n/10;
            count++;
        }
        if(count == 2){
            f = num%10;
            s = num/10;
            sum = f*f + s*s;
        }
        if(count == 3){
            f = num%10;
            s = num/10%10;
            t = num/100;
            sum = f*f*f + s*s*s + t*t*t;
        }
        if(count == 4){
            f = num%10;
            s = num/10%10;
            t = num/100%10;
            forth = num/1000;
            sum = f*f*f*f + s*s*s*s + t*t*t*t + f*f*f*f;
        }
        System.out.println("number of didits "+sum);
    }
}