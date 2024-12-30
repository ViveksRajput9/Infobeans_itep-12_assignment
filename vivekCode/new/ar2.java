// reverse the array

import java.util.Scanner;
class Ar2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the size of array");
        int s = sc.nextInt();
        int a [] = new int [s];
        int b[] = new int [s];
        int temp;

        System.out.println("give thr array value");
        for(int i=0; i<s; i++){
            a[i] = sc.nextInt();
        }
        int j = s-1;
        for(int i=0; i<s; i++){
           b[j] = a[i];
           j--;
        }
        
        for(int i=0; i<s; i++){
            a[i] = b[i];
            System.out.println("answer " + a[i]);
        }
    }
}