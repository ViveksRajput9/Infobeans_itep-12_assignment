abstract class Appliance{

    private boolean isOn;
    private String  brand;

    Appliance(String brand){
        this.brand = brand;
        this.isOn = false;
    }
    abstract void operate();
    void turnOn(){
        this.isOn = true;
        System.out.println("The appliance is now ON");
    }
    void turnOff(){
        this.isOn = false;
        System.out.println("The appliance is now OFF");
    }
    String getBrand(){
        return brand;
    }

}
class WashingMachine extends Appliance
{
    WashingMachine(String brand){
        super(brand);
    }
    void operate(){
        System.out.println("The washing machine is washing clothes.");
    }

}
class Refrigerator extends Appliance{
    Refrigerator(String brand){
        super(brand);
    }
    void operate(){
        System.out.println("The refrigerator is cooling items.");
    }

}
public class ApplianceMain {
    public static void main(String... ar){
        Appliance washingMachine = new WashingMachine("LG");
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();
        System.out.println();
        Appliance refrigerator = new Refrigerator("Samsung");
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}
