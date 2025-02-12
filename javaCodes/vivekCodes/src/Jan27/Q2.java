package Jan27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int value = scanner.nextInt();
			try {
				if (value > 7) {
					throw new IllegalArgumentException("Number should not be greater than 7");

				} else {
					try {
						if (value == 0) {
							throw new ArithmeticException("by zero");
						}else {
							System.out.println(value);
						}
					} catch (ArithmeticException e) {
						System.out.println("handled");
					}
				}
			
			} catch (IllegalArgumentException e) {
				System.out.println("handled");
			}
		
	} catch (InputMismatchException e) {
		System.out.println("input should be Integer");
		}
		finally {
			 scanner.close();
		}
	}
}