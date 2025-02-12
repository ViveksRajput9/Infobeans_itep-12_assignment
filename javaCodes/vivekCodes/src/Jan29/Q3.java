package Jan29;

import java.util.InputMismatchException;
import java.util.Scanner;

class UnderAgeException extends RuntimeException{
	public UnderAgeException() {
		super("invalid age candidate should be greater than 18 year");
		// TODO Auto-generated constructor stub
	}
}
public class Q3 {
	public static boolean verifyAge(int age) {
		if(age<18) {
			try {
				throw new UnderAgeException();
			}catch (UnderAgeException e) {
				System.out.println(e.getMessage());
			}
		}
		return true;
	}
	public static void main(String ar[]) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Age :- ");
			int age = scanner.nextInt();
			if(verifyAge(age)) {
				System.out.println("valid Age");
			}else {
				System.out.println("invalid age");
			}
		} catch (InputMismatchException e) {
			System.out.println(e+" input must be integer ");
		}
	}
}