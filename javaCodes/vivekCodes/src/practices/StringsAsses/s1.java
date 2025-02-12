package practices.StringsAsses;
import java.util.Scanner;

import static  practices.StringsAsses.Methods.*;
public class s1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the words or sentence ");
		String chaString = scanner.nextLine();
		System.out.println("vowels:- " +countVowels(chaString));
		System.out.println("count Spaces :- "+ countSpace(chaString));
		System.out.println("Enter char :- ");
		char c1 = scanner.next().charAt(0);
		System.out.println("Occurred :- "+countOccuredChar(chaString, c1));
		System.out.println("vowels Upper case :- " +vowelToUpperCase(chaString));
		System.out.println("consonents :- "+countConsonents(chaString) );
		
		String str ="";
		for (int i = 0; i < chaString.length(); i++) {
			char c = chaString.charAt(i);
			if(isVowel(c)) {
				String a="";
				a+=c;
				str += a.toUpperCase();;
			}else {
				str += c;
			}
			
		}
		System.out.println(str);
		
	}
}