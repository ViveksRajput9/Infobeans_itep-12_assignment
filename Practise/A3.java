package Lamda.Practise;

import java.util.ArrayList;
import java.util.function.Predicate;
record Product(String productName,int price,float rating ) {}
record Employee(String name,int id,int experience,double rating) {}

public class A3 {
	public static void isEmailValid() {
		Predicate<String> a = s->(s.endsWith(".com")&&s.split("@").length==2);
		System.out.println(a.test("vivekSingh60271@gmail.com"));
	}
	public static void isPalindrome() {
		Predicate<String> p = s -> (s.equals( new StringBuilder(s).reverse().toString()));
		System.out.println(p.test("naman"));
	}
	public static void discount() {
		Product p1 = new Product("milk", 40, 4f);
		Product p2 = new Product("Mobile", 550, 4.5f);
		Product p3 = new Product("Laptop", 600, 5f);
		Product p4 = new Product("Lic", 40, 4.5f);
		Product p5 = new Product("biscuit", 500, 3.5f);
		Product p6 = new Product("googly", 700, 2.5f);
		Predicate<Product> p = e -> (e.price()>=500&&e.rating()>4.0f);
		System.out.println(p.test(p5));
	}
	public static void employeePromotion() {
		ArrayList<Employee> e = new ArrayList<>();
		e.add(new Employee("Mohit", 101, 2, 4.5));
		e.add(new Employee("prerna", 102, 1,3.5));
		e.add(new Employee("Badal", 103, 3, 4.0));
		e.add(new Employee("Vivek", 104, 5, 4.5));
		e.add(new Employee("Umesh", 105, 5, 4.8));
		Predicate<Employee> p = f -> f.experience()>=3&&f.rating()>=4.2;
		ArrayList<Employee> ed = new ArrayList<>();
		for(Employee employee:e) {
			if(p.test(employee)) ed.add(employee);
		}
		System.out.println(ed);
		
	}
	public static void main(String[] args) {
		isEmailValid();
		isPalindrome();
		discount();
		employeePromotion();
	}
}