// import java.util.Scanner;
// class Ar8{
//     public static void main(String args[]){
//         int i, j, n, sum, f, m, l, qSum;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("give the array size");
//         n = sc.nextInt();
//         int ar[] = new int [n];
//         for(i=0; i<n; i++){
//             ar[i] = sc.nextInt();
//         }
//         for(i=0; i<n; i++){
//             if(ar[i]>99 && ar[i]<1000){
//                 f = ar[i]%10;
//                 m = ar[i]/10%10;
//                 l = ar[i]/100;
//                 qSum = f*f*f+m*m*m+l*l*l;
//                 if(qSum==ar[i])
//                 System.out.println("the amstrong no is " + qSum);
//             }
//         }
//     }
// }

import java.util.Scanner;
class Ar8{
    public static void main(String args[]){
        int i, j, n, f, m, l, qSum;
        Scanner sc = new Scanner(System.in);
        System.out.println("give the array size");
        n = sc.nextInt();
        int ar[] = new int [n];
        for(i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        int count=0, num, sum, rem, men;
        for(i=0; i<n; i++){
            count =0;
            men = ar[i];
            sum=1;
            num = ar[i];
            while(ar[i]>0){
                rem = ar[i]%10;
                ar[i] = ar[i]/10;
                count++;
            }
            System.out.println(count);
            while(num>0){
                for(i=1; i<=count; i++){
                    rem = num%10;
                    sum = sum*num;
                    num = num/10;
                }
            }
            if(sum==men){
                System.out.println(men + " is armstrong number");
            }else{
                System.out.println(men + " is not armstrong number");
            }
        }
    }
}