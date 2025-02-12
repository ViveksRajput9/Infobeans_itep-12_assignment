package Jan29;
import java.util.InputMismatchException;
import java.util.Scanner;

	public class Q2 {
	public static int cube(int num) {
		return num*num*num;
	}
	public static boolean isArmstrong(int num) {
		if(num<0) throw new IllegalArgumentException("Error: input number must be non-negative");
		int flag =0;
		int value = num;
		while(num!=0) {
			int n = num%10;
			num = num/10;
			flag += cube(n);
		}
		return (flag==value)? true:false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =0;
		System.out.println("Enter Interger num");
		try {
			num = scanner.nextInt();
//		    num = Integer.parseInt(scanner.next());
			
		} catch (InputMismatchException e) {
			System.out.println("Error: input must be a valid integer.");
			
		}finally {
			if(isArmstrong(num)) {
				System.out.println(num + " is Armstrong number");
			}else {
				System.out.println(num + " is not Armstrong number");
			}
		}
	}
}
