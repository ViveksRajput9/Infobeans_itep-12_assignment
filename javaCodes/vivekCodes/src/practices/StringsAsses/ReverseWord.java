package practices.StringsAsses;

import java.util.Scanner;
import static practices.StringsAsses.Methods.*;
public class ReverseWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		System.out.print("Enter the sentences :- ");
		StringBuffer str = new StringBuffer(scanner.nextLine());
		reverseWords(str);
		System.out.println(str);
	}
}
