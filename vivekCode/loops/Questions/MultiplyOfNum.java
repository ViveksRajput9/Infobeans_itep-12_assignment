package loops.Questions;

import java.util.Scanner;
class MultiplyOfNum{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the num :- ");
        int n = scan.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(i+" * "+n+" = "+i*n);
            i++;
        }
    }
}