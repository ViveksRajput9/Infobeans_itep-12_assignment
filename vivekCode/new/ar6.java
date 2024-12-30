// squre

import java.util.Scanner;
class Ar6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the size of array");
        int s = sc.nextInt();
        int a [] = new int [s];

        System.out.println("give thr array value");
        for(int i=0; i<s; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("squre");

        for(int i=0; i<s; i++){
        System.out.println(a[i]*a[i]);
        }
    }
}