package Jan27;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  a= scanner.nextInt();
		int b= scanner.nextInt();
		
		try {
		   int c = a/b;
		   System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			scanner.close();
		}
		
	}
}