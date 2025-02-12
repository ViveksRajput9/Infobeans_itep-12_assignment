//Remove all spaces from a given string without using built-in methods.
//Example Input: I love coding
//Example Output: Ilovecoding
package practices.StringsAsses;

import java.util.Scanner;

class spaceRemove4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give your string");
		String value = sc.nextLine();
		String str = new String(value);
		
		char strArr[] = new char[str.length()];
//		String space = " ";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				strArr[i] = str.charAt(i);
			}
		}
		String str2 = new String(strArr);
		System.out.println("without space String is: " + str2);
	}
}