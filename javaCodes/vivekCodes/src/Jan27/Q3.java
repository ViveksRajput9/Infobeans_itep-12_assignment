package Jan27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int input =scanner.nextInt();
			System.out.println(input);
			
		}catch (InputMismatchException e) {
			System.out.println(e);
		}finally {
			scanner.close();
		}
	}
}