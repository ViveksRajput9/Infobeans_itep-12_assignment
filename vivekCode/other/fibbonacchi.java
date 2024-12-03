public class fibbonacchi {
    public static void main(String[] args) {
        int a=0,b=1,c,i=1;
        System.out.print(a+" "+b);
        for(;i<=5;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
        System.out.println();
    }
}