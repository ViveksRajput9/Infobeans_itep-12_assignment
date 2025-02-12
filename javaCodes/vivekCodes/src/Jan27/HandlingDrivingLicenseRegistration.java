package Jan27;

import java.util.Scanner;
class InvalidAgeForDrivingLicenseException extends RuntimeException{
	public InvalidAgeForDrivingLicenseException() {
		super("Age should be more than 18 years");
	}
}
class InvalidMarkException extends RuntimeException {
	public InvalidMarkException() {
		super("Invalid Mark");
	}
}

class DrivingLicense{
	String name;
	int age;
	int mark;
	public DrivingLicense(String name , int age , int mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
}
public class HandlingDrivingLicenseRegistration {
	public static Scanner scanner = new Scanner(System.in);
	
	public static DrivingLicense Input() {
		System.out.println("Enter name :-");
		String name = scanner.nextLine();
		System.out.println("Enter age :-");
		int age = scanner.nextInt();
		System.out.println("Enter mark :-");
		int mark = scanner.nextInt();
		if(age<19&&age>75) {
			throw new InvalidAgeForDrivingLicenseException();
		}
		if(mark<=80) {
			throw new InvalidMarkException();
		}
		return new DrivingLicense(name, age, mark);
		
	}
	public static void main(String[] args) {
		
	}
}