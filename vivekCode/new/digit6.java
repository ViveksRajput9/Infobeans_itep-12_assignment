import java.util.Scanner;
class Counts{
int count(){
    int count=0;
        int rem, i=1;
                for(int n:ar){
                int count = 0;
                while(n>0){
                    rem = n%10;
                    n=n/10;
                     count++;
                }
                 System.out.println(count);
                i++;return count;  
            // System.out.println(count());
        }
}
}
class Digit6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the earray size");
        int sz = sc.nextInt();
        int ar[] = new int[sz];
        System.out.println("give the numers of array");
        for(int i=0; i<sz; i++){
            ar[i] = sc.nextInt();
        }
        Counts c1 = new Counts();
        System.out.println(c1.count());
            
    }
}
