package vivekCode.oops;

public class Car {
    String make;
    String model;
    int year;
    
    Car(){
        make = "Toyota";
        model = "Camry";
        year = 2015;
    }
    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        }
    public void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        }
        
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayDetails();
        Car car2 = new Car("Honda", "Civic", 2018);
        car2.displayDetails();

    }
}
