package ExceptionHandlingAsses;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		    int a = 10/0;
		    int bString= Integer.parseInt(args[1]);
		    
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("can't divide by zero");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
}