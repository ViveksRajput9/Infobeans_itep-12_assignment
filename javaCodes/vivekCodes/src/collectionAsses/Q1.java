package collectionAsses;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class Q1 {
	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		l.add("vivek");
		l.add("mohit");
		
		l.add("vikas");
		l.add("amit");
		
		l.add("abhishek");
		l.add("ashu");
		l.add("badal");
		
		l.add("vivek");
		
		l.add("anjali");
		l.add("ashok");
		for (int i = 0; i < l.size(); i++) {
			if(l.get(i).startsWith("a")) {
				l.set(i,l.get(i).toUpperCase());
			}
		}
		System.out.println(l);
	}
}
