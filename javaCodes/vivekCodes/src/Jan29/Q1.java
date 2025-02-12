package Jan29;

import java.util.Scanner;

class Student{
	String name;
	int age;
	public Student(String name , int age) {
		this.name= name;
		this.age = age;
	}
}
public class Q1 {
	public static boolean validGrade(int grade) {
		if(grade<0 || grade>100) {
			try {
				throw new IllegalArgumentException("invalid grade: "+grade);
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return true;
	}
	public static Student input() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Name :- ");
			String name = scanner.nextLine();
			System.out.print("Enter grade :- ");
			int grade = Integer.parseInt(scanner.next());
			if(validGrade(grade)) {
				System.out.println("Grade for "+name+": "+grade);
				return new Student(name,grade);
			}
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		return null;
	}
	public static void main(String[] args) {
		Student s= input();
	}
}