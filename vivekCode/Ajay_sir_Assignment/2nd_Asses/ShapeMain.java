class Shape{
    String color;
    void displayColor(){
        System.out.println("Color is: "+color);
    }
}
class Circle extends Shape{
    int radius;
    Circle(String color, int radius){
        super.color = color;
        this.radius = radius;
    }
    void calculatArea(){
        super.displayColor();
        System.out.println("Area of circle is: " + (3.14*radius*radius));
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle("Red",5);
        circle.displayColor();
    }
    
}
