import java.util.Scanner;
class p4{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1  Area of Rectangle");
        System.out.println(" 2  Area of Circle");
        System.out.println(" 3  Area of triangle");
        System.out.println(" 4  Area of Square");
        System.out.print("select shape :- ");
        int shape = scan.nextInt();
        switch(shape){
            case 1 : 
                System.out.print("Enter length :- ");
                int l = scan.nextInt();
                System.out.print("Enter Breadth :- ");
                int b = scan.nextInt();
    
                double result = l*b;
                System.out.println("Area of rectangle is :- "+ result);
                break;
            case 2 :
                System.out.print("Enter Radius :- ");
                int r = scan.nextInt();
                result = Math.PI*r*r;
                System.out.println("Area of circle is :- "+result);
                break;
            case 3:
                System.out.print("Enter height :- ");
                int h = scan.nextInt();
                System.out.print("Enter base :- ");
                b = scan.nextInt();
                result = (b*h)/2;
                System.out.println("area of Triangle is :- " + result);
                break;
            case 4:
                System.out.print("Enter side :- ");
                int s = scan.nextInt();
                result = s*s;
                System.out.println("area of Square :- " + result);
                break;
            default : System.out.println("invalid input");
        }
        
    }
}