package practices.StringsAsses;

import static practices.StringsAsses.Methods.*;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter :- ");
		String password = scanner.nextLine();
		if(isPasswordValid(password)) {
			
		System.out.println("Congratulation your password is valid ");
		}
		else {
			System.out.println("oops... Not valid password \n Example:- Ex@123ab  \n length should be 8 to 15 character ");
			
		}
		
	}
}
