package practices.StringsAsses;

import java.util.Scanner;
import static practices.StringsAsses.Methods.*;

public class Q3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner( System.in);
	System.out.print("Enter the sentences :- ");
	String string = scanner.nextLine();
	System.out.println("Enter the word want to replace:- ");
	String string2 = scanner.nextLine();
	System.out.println("Enter the word which replace :- ");
	String string3 = scanner.nextLine();
	
	System.out.println(replaceWord(string, string2, string3).concat("vivek"));
	
}
}