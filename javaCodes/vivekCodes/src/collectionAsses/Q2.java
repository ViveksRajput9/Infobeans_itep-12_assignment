package collectionAsses;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		List <Integer> l = new ArrayList<>();
		for(int i = 1;i<100;i++) {
			l.add(i);
		}
		System.out.println(l);

		l.forEach(e -> {if(e%2==0)System.out.print(e+",");});
	}

}
