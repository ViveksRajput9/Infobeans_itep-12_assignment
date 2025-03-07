package Lamda.Practise;

import java.util.HashSet;

interface ReverseString{
	String reverseString(String string);
}
interface CountVowels {
	int countVowels(String s);
}
interface Fibbonacci{
	int fibonacci(int n);
}
interface SumOfDigits{
	int sumOfDigits(int n);
}
interface WordCounter{
	int countWords(String s);
}
public class A2 {
	public static void Q1() {
		ReverseString r = string-> {
			String rs = "";
			for(int i= string.length()-1;i>=0;i--) {
				rs += string.charAt(i);
			}
			return rs;
		};
		System.out.println(r.reverseString("Infobeans Foundation"));
	}
	public static  void Q2() {
		HashSet<Character> h =new HashSet<>();
		h.add('a');
		h.add('e');
		h.add('i');
		h.add('o');
		h.add('u');
		h.add('A');
		h.add('E');
		h.add('I');
		h.add('O');
		h.add('U');


		CountVowels c = (s)->{
			int countVowels = 0;
			for(char c1:s.toCharArray()) {
				if(h.contains(c1)) countVowels++;
			}
			return countVowels;
		};
		System.out.println(c.countVowels("vivek"));
	}
	public static void Q3() {
		Fibbonacci f = n->{
			int s = 0;
			int e = 1;
			while(n!=0) {
			   int temp = s+e;
			   s = e;
			   e = temp;
			   n--;
			}
			return e;
		};
		System.out.println(f.fibonacci(10));
	}
	public static void Q4() {
		SumOfDigits s = n ->{
			int sum =0;
			while(n!=0) {
				sum+=n;
				n--;
			}
			return sum;
		};
		System.out.println(s.sumOfDigits(15));
	}
	public static void Q5() {
		WordCounter c = s-> s.trim().split("\\s+").length;
		System.out.println(c.countWords("vivek singh rajput   sdf"));
		System.out.println(c.countWords("i am vivek singh rajput i am son of mr.sumer singh and mrs.sangita rajput i belongs to harda currently live in indore for further study and i am parshuing mca degree "));
	}
	public static void main(String[] args) {
		Q1();
		System.out.println();
		Q2();
		System.out.println();
		Q3();
		System.out.println();
		Q4();
		System.out.println();
		Q5();
	}
}