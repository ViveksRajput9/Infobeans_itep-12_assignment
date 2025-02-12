package vivekCode;

import java.util.Scanner;

interface Principle {
	void getPrinciple();
	
}
interface InterestRate{
	void getInterestRate();
}
class Loan implements Principle , InterestRate
{
	double principleAmount;
	double interestRate;
	double duration;
	Scanner sc = new Scanner(System.in);
	public void getPrinciple(){
			while(true) {
		
				System.out.println("Enter the Principle Amount Rs. 1 to Rs. 1000000");
				System.out.print("Enter :- ");
				principleAmount = sc.nextDouble();
				if(principleAmount>0&&principleAmount<=1000000) {
					break;
				}else {
					System.out.println(" oops... Wrong input ");
				}
			}
		
	}
	public void getInterestRate() {
			while(true) {
		
				System.out.println("Enter the InterestRate between 0.01 to 0.99");
				System.out.print("Enter :- ");
				interestRate= sc.nextDouble();
				if(interestRate>=0.01&&interestRate<=0.99) {
					break;
				}else {
					System.out.println(" oops... Wrong input ");
				}
			}
		
	}
	public void getDuration() {
			while(true) {
		
				System.out.println("Enter the duration between  1 to 10 ");
				System.out.print("Enter :- ");
				duration= sc.nextDouble();
				if(duration>0&&duration<11) {
					break;
				}else {
					System.out.println(" oops... Wrong input ");
				}
			}
	}
	public void calculateInterest() {
		System.out.println("Total interest paid : " +(principleAmount*interestRate*duration));
	}
	
}
public class CarLoanCalculatorMain {
	public static void main(String[] args) {
		Loan loan = new Loan();
		loan.getPrinciple();
		loan.getInterestRate();
		loan.getDuration();
		loan.calculateInterest();
	}
}
