import java.util.Scanner;
class Strog{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum=0, fact, rem;
        while(n>0){
            rem = n%10;
            fact = 1;
            for(int i=1; i<=rem; i++){
                fact = fact*i;
            }
            sum = sum + fact;
            //System.out.println(sum);
            n = n/10;
        }
        if(sum == num){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}