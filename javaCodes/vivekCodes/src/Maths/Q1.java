package Maths;

import java.util.Scanner;
interface m {
	public static int ran(int end) {
		
		return  (int)(Math.random()*end);
	}
	public static int ran(int start , int end) {
	
		return start + (int)(Math.random()*end);
	}
}
public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start point to generate random number");
		int start = scanner.nextInt();
		System.out.println("Enter the end num ");
		int end = scanner.nextInt();
		int a = 0;
		while(a<=15) {
			a++;
			System.out.println();
//		System.out.println(m.ran(end));
		System.out.println();

		System.out.println(m.ran(start,end));
		}
	}
}