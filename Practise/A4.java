package Lamda.Practise;

import java.util.regex.Pattern;
interface PasswordValidator{
	public static boolean isDigit(String s) {
	    for(int i = 0;i<s.length();i++) if(s.charAt(i)>=48&&s.charAt(i)<=57) return true;
	    return false;
	}
	public static boolean isLowerChase(String s) {
		for(int i = 0;i<s.length();i++) if(s.charAt(i)>=97&&s.charAt(i)<=122) return true;
		return false;
		
	}
	public static boolean isUpperCase(String s) {
		for(int i = 0;i<s.length();i++) if(s.charAt(i)>=65&&s.charAt(i)<=90) return true;
		return false;

	}
	public static boolean isSpecialChar(String s) {
		for(int i = 0;i<s.length();i++) if(s.charAt(i)>=33&&s.charAt(i)<=46||s.charAt(i)>=58&&s.charAt(i)<=64) return true;
        return false;
	}
}
public class A4 {
//	public static boolean isValidPassword(String password) {
//		if(password.length()<8||password.length()>16) return false;
//		boolean p = Pattern.compile("[a-z]").matcher(password).find();
//		boolean p1 = Pattern.compile("[A-Z]").matcher(password).find();
//		boolean p2 = Pattern.compile("[0-9]").matcher(password).find();
//		boolean p3 = Pattern.compile("[^a-zA-z0-9]").matcher(password).find();
//
//		return p==p1&&p2==p3;
//	}
	
	public static void isValidPassword(String password) {
		if(password.length()<8) {System.out.println("password length at least 8 ");return;}
		boolean isUpperCase = PasswordValidator.isUpperCase(password);
		boolean isLowerCase = PasswordValidator.isLowerChase(password);
		boolean isDigit = PasswordValidator.isDigit(password);
		boolean isSpecialChar = PasswordValidator.isSpecialChar(password);
		if(isUpperCase&&isLowerCase&&isDigit&&isSpecialChar) System.out.println("Strong Password");
		else if(isUpperCase&&isLowerCase&&isDigit) System.out.println("Weak Password (No Special & Uppercase letter)");
		else if(isLowerCase&&isDigit) System.out.println("Weak Password (No Special letter)");
		else if(isUpperCase&&isDigit) System.out.println("Weak Password (No lowercase letter)");
	}
	public static void main(String[] args) {
	  isValidPassword("viSdd354");
	  
	}
}