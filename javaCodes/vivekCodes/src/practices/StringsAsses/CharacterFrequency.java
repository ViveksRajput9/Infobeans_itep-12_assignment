package practices.StringsAsses;

import java.util.Scanner;
import static practices.StringsAsses.Methods.*;
public class CharacterFrequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string");
		String string = scan.nextLine();
		int frequency[]=characterFrequency(string);
		// print characters 
		for(int i= 0;i<frequency.length;i++) {
			if(frequency[i]!=0){
				System.out.println((char)i + " "+frequency[i]);
			}
		}
	}
}
