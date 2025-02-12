package collectionAsses.day2;
import java.util.*;
public class q1 {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> ar = new ArrayList<>();
		int minCapacity=0;
		try {
			minCapacity = Integer.parseInt(scanner.nextLine());
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		ar.ensureCapacity(minCapacity);
		String n = scanner.nextLine();
		String input[] = n.trim().split(" ");
		for(int i =0;i<input.length;i++) {
			try {
				int d = Integer.parseInt(input[i]);
				ar.add(d);
				
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}
		Integer value = Integer.parseInt(scanner.nextLine());
		if(ar.contains(value)) {
			System.out.println("Number "+value+" exists in the ArrayList");
		}else {
			System.out.println("Number "+value+" not exists in the ArrayList");
		}
		value = Integer.parseInt(scanner.nextLine());
		System.out.println(ar.remove(value));
		
		System.out.println(ar);
		for(int i = 0;i<ar.size();i++) {
			System.out.print(ar.get(i)+" ");
		}
		
		Iterator<Integer> l  = ar.iterator();
		while(l.hasNext()) {
			System.out.print(l.next()+" ");
		}  
		
		for(Integer s:ar) {
			System.out.print(s+" ");
		}
	}
}