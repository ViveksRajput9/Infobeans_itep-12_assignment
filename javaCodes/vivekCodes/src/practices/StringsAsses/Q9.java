package practices.StringsAsses;
import static practices.StringsAsses.Methods.*;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		System.out.println(toAscii(string));
		
	}
}