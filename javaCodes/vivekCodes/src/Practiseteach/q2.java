package Practiseteach;
import java.util.Scanner;
class DotException extends RuntimeException
{
DotException(){
super("Invalid Dot usage");
}
}
class AtTheRateException  extends RuntimeException
{
AtTheRateException (){
super("Invalid @ usage");
}
}
class DomainException extends RuntimeException
{
DomainException(){
super("Invalid Domain");
}
}
public class q2{
public static boolean checkDomain(String domain){
if(domain.equals("gmail.com")||domain.equals("gmail.in")||domain.equals("gmail.net")||domain.equals("gmail.biz")) return true;
return false;
}
public static void isvalid(String email){
String e[] = email.split("@");
try{
if(email.charAt(email.length()-1)=='.') throw new DotException();
if(e.length > 2) throw new AtTheRateException();
if(!checkDomain(e[e.length-1])) throw new DomainException();
}catch(DotException ei){
System.out.println(ei.getMessage());
 

}catch(AtTheRateException ee){
System.out.println(ee.getMessage());

}
catch(DomainException eee){
System.out.println(eee.getMessage());
}
}
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
String email = sc.nextLine();
isvalid(email);
}
}



