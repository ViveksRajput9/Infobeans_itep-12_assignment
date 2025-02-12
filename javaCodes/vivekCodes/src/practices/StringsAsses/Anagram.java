package practices.StringsAsses;
import static practices.StringsAsses.Methods.*;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Word :- ");
		String str1 = scanner.nextLine();
		System.out.println("Enter the second Word :- ");
		String str2 = scanner.nextLine();
		if(isAnagram(str1, str2)) System.out.println("yes it's anagram");
		else System.out.println("No it's not anagram");
		
	}
}