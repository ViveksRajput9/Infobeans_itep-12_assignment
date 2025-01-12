package vivekCode;

interface Shape{
	void calculateArea();
}
class Circle implements Shape
{ 
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public void calculateArea() {
		System.out.println("Area of Circle is : " + (Math.PI*radius*radius));
	}
}
class Rectangle implements Shape 
{
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	double length , breadth;
	public void calculateArea() {
		System.out.println("Area of Rectangle is : "+ (length*breadth));
	}
}
public class ShapeAreaMain {
	public static void main(String[] args) {
		Shape obj = new Circle(45);
		obj.calculateArea();
		Shape obj1 = new Rectangle(34,32);
		obj1.calculateArea();
	}
}
