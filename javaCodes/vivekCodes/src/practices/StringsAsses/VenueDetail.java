package practices.StringsAsses;

import java.util.Scanner;

class Main{
	String venueName;
	String city;
	Main(String venueName , String city) {
		this.venueName = venueName;
		this.city = city;
	}
	void venueDetails() {
		System.out.println("venue Name :- "+venueName);
		System.out.println("city Name :- "+ city);
	}
}
public class VenueDetail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter venue Detail's :-");
		String detail = scanner.nextLine();
		String[] venueDetails = detail.split(",");

		Main obj = new Main(venueDetails[0], venueDetails[1]) ;
		obj.venueDetails();
	}
}