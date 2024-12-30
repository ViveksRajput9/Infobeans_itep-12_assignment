import java.util.Scanner;
class Count{

}
class Digit5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the earray size");
        int sz = sc.nextInt();
        int ar[] = new int[sz];
        System.out.println("give the numers of array");
        for(int i=0; i<sz; i++){
            ar[i] = sc.nextInt();
        }
        int f, s, t, opst;
        for(int n:ar){
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
}