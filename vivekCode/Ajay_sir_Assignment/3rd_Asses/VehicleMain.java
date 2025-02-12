class Vehicle{
    String vehicleType;
    Vehicle(String vehicleType){
        this.vehicleType = vehicleType;
    }

}
class Car extends Vehicle{
    String brand;
    Car(String vehicleType , String brand){
        super(vehicleType);
        this.brand= brand;
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        
    }
}
