package asses;

import java.util.Scanner;

interface NumberInput{
	void UserInput();
	
}
interface AutomorphicChecker {
	void checkAutomorphic();
}
class Automorphic implements NumberInput, AutomorphicChecker
{
	int num;
	public void UserInput() {
		try(Scanner sc = new Scanner(System.in)){	
			do {
				System.out.println("Enter number in range 1 to 500 ");
       			System.out.print("Enter the Number :- ");
       			num = sc.nextInt();
       			if(num>1&&num<500) {
       				break;
       			}else {
       				System.out.println("oops... Enter wrong input");
       			}
		        
			} while (true);
		}
	}
	public void checkAutomorphic() {
		int whoseSquare = num * num;
		int lastDigit = whoseSquare%100;
		if(lastDigit == num) {
			System.out.println(num +" is an Automorphic Number");
		}else {
			System.out.println(num +" is not an Automorphic Number");
		}
		
	}
}
public class AutomorphicMain {
	public static void main(String[] args) {
		Automorphic obj = new Automorphic();
		obj.UserInput();
		obj.checkAutomorphic();
	}
}