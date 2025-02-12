package Jan27;

import java.util.Scanner;

class DotException extends RuntimeException{
	public DotException() {
		super("invalid . usage ");
	}
}
class AtTheRateException extends RuntimeException{
	public AtTheRateException() {
		super("invalid @ usage");
	}
}
class DomainException extends RuntimeException{
	public DomainException() {
		super("Invalid Domain Invalid Email address");
	}
}
public class ValidateEmail {
	public static boolean isDomainValid(String eMail) {
		if(eMail.endsWith("@gmail.in")||eMail.endsWith("@gmail.com")||
				eMail.endsWith("@gmail.net")||eMail.endsWith("@gmail.biz")||eMail.endsWith("@yahoo.com")||eMail.endsWith("@yahoo.in")||eMail.endsWith("@yahoo.net")) {
		   return true;
		}
        return false;
	}
	public static boolean isValidate(String eMail) {
		if(eMail.endsWith(".")) throw new DomainException();
		if(!isDomainValid(eMail)) throw new DomainException();
		if(eMail.split("@").length>=3) throw new AtTheRateException();
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Email Address :-");
		String email = scanner.nextLine();
		System.out.println(isValidate(email));
	}
}