import java.util.Scanner;
class Digit4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f, s, t, opst;
        if(n>9 && n<100){
            f = n%10;
            s = n/10;
            opst = f*10 + s;
            if(opst == n)System.out.println(n + " the no is palintrom number");
            else{
                System.out.println(n + " the no is not palintrom number");
            } 
        }
        if(n>99 && n<1000){
            f = n%10;
            s = n/10%10;
            t = n/100;
            opst = f*100 + s*10 + t;
            if(opst == n)System.out.println(n + " the no is palintrom number");
            else{
                System.out.println(n + " the no is not palintrom number");
            } 
        }
    }
}