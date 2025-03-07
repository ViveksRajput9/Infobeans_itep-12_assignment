package Lamda.Practise;

import java.util.Stack;

interface Compare{
	String compare(int a,int b);
	
}
interface LengthFinder{
	int getLength(String str);
}
interface FindFactorial{
	int factorial(int factorial);
}
interface PowerCalculator{
	double getPower(int base ,int exponent);
}
interface Palindrome{
	boolean isPalindrome(String s);
}
interface ConcateString {
	String concatString(String string1,String string2);
}
interface Squre{
	double squre(int num);
}
interface UpperCase{
	String upper(String string);
}
interface FindMax{
	String max(int a, int b, int c);
}
interface Even{
	String evenOdd(int num);
}
public class A1 {
	public static void Q1() {
		Compare c= (a,b)->{
			if(a>b) return "Greater";
			if(a<b) return "Smaller";
			if(a==b) return "Equal";
			return null;
		};
		String s = c.compare(15, 65);
		System.out.println(s);
	}
	public static void Q2() {
		LengthFinder l = (s)-> s.length();
		int length = l.getLength("vivek singh rajput");
		System.out.println(length);
	}
	public static void Q3() {
		FindFactorial f = (c)-> {
			int a = 1;
			for(int i = 1;i<=c;i++) {
				a = i*a;
			}
			return a ;
		};
		System.out.println(f.factorial(5));
	}
	public static void Q4() {
		PowerCalculator p = (base,exponent)->Math.pow(base,exponent);
		double a = p.getPower(15, 20);
		System.out.println(a);
	}
	public static void Q5() {
		Palindrome p = (string)-> {		
			int length =string.length();
			for (int i = 0; i < length/2; i++) {
				if(string.charAt(i)!=string.charAt(length-i-1)) return false;
			}
			return true;
		};
		boolean result = p.isPalindrome("asdfdsa");
		if(result) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	public static void Q6() {
		ConcateString c  = (string1,string2)->string1.concat(string2);
	    String s =	c.concatString("vivek ", "Singh");
		System.out.println(s);
	}
	public static void Q7() {
		Squre s = (a)-> a*a;
		double s1 = s.squre(25);
		System.out.println(s1);
	}
	public static void Q8() {
		UpperCase s = (a)-> a.toUpperCase();
		String string = s.upper("vivek singh rajput");
		System.out.println(string);
	}
	public static void Q9() {
		FindMax m = (a,b,c)->{
			if(a>b&&a>c)return a+" max";
			if(b>c) return b+" max";
			if(c>a)return c+"max";
			return "Equal";
			
		};
	    String s = m.max(10, 20, 11);
	    System.out.println(s);
		
	}
	public static void Q10() {
		Even e = (num)->(num%2==0)? "Even":"Odd";
		String s = e.evenOdd(16);
		System.out.println(s);
	}
	public static void main(String[] args) {
		System.out.println("Question 1");
		Q1();
		System.out.println();

		System.out.println("Question 2");	
		Q2();
		System.out.println();
	
		System.out.println("Question 3");
		Q3();
		System.out.println();

		System.out.println("Question 4");
		Q4();
		System.out.println();

		System.out.println("Question 5");
		Q5();
		System.out.println();

		System.out.println("Question 6");
		Q6();
		System.out.println();

		System.out.println("Question 7");
		Q7();
		System.out.println();

		System.out.println("Question 8");
		Q8();
		System.out.println();

		System.out.println("Question 9");
		Q9();
		System.out.println();

		System.out.println("Question 10");
		Q10();
		System.out.println();

	}
}