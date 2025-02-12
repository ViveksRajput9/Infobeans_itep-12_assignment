
package asses;
interface Calculator
{
	static int add(int a , int b){
		return a+b;
	}
	default int subtract(int a,int b) {
		return a-b;
	}
}
class BasicCalculator implements Calculator
{
	
}
public class CalculatorMain {
	public static void main(String[] args) {
		System.out.println(Calculator.add(10, 50));
		BasicCalculator objBasicCalculator = new BasicCalculator();
		System.out.println(objBasicCalculator.subtract(10, 5));
	}
}
