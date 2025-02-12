package asses;
interface Ride
{
	void calculateFare(double distance);
}
class BikeRide implements Ride
{
	@Override
	public void calculateFare(double distance) {
		System.out.println(" Total fare of BikeRide is : Rs."+(distance*5));
	}
}
class CarRide implements Ride
{
	@Override
	public void calculateFare(double distance) {
		System.out.println(" Total fare of CarRide is : Rs."+(distance*10));
	}
}
class SharedRide implements Ride 
{
	@Override
	public void calculateFare(double distance) {
		System.out.println(" Total fare of Shared Ride is : Rs."+(distance*3.5));
	}
}
public class RideMain {
	public static void main(String[] args) {
		Ride  ride = new CarRide();
		ride.calculateFare(10);
		Ride  ride1= new BikeRide();
		ride1.calculateFare(15);
	}
}
