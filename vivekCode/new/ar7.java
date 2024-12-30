// sum of array numbers

import java.util.Scanner;
class Ar7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the size of array");
        int s = sc.nextInt();
        int a [] = new int [s];
        int sumOfArry=0;

        System.out.println("give thr array value");
        for(int i=0; i<s; i++){
            a[i] = sc.nextInt();
            sumOfArry+=a[i];
        }
        System.out.println(sumOfArry);
    }
}