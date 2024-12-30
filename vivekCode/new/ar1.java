// find maximum

import java.util.Scanner;
class Ar1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the size of array");
        int s = sc.nextInt();
        int a [] = new int [s];
        int max = a[0];

        System.out.println("give thr array value");
        for(int i=0; i<s; i++){
            a[i] = sc.nextInt();
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("the maximum value is " + max);
    }
}