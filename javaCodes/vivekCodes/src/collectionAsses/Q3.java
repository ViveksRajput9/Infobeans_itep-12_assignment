package collectionAsses;
import java.util.*;
public class Q3 {
	public static boolean isPerfectNumber(int num) {
		int n = 0;
		int duplicatNum = num;
		for (int i = 1; i <= num/2;i++) {
			if(num%i==0) {
				n+=i;
			}
		}
		return (n==duplicatNum)? true: false ;
	}
	
	public static void main(String[] args) {
	   	List <Integer> l = new ArrayList<>();
	   	for (int i = 1; i < 1050; i++) {
			l.add(i);
		}
	   	System.out.println(l);
//	   	System.out.println("hello");
//	   	System.out.println(isPerfectNumber(6));
	   	l.forEach(num -> {if(isPerfectNumber(num))System.out.println(num);});
	}
}