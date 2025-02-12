package Jan27;

import java.util.Scanner;

class InvalidQuantityException extends RuntimeException{
	public InvalidQuantityException(String message) {
		super(message);
	}
}
class Book{
	String id;
	String bookTitle;
	String authorName;
	float price;
	int quantity;
	public Book(String id, String bookTitle,String authorName,float price,int quantity) {
		this.id= id;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
	}
	public void purchase(int quantity) {
		if(quantity > this.quantity) throw new InvalidQuantityException("Quantity not availabe , Available Quantity :- "+this.quantity);
		this.quantity -= quantity;
		System.out.println("Quantity Available: "+this.quantity);
	}
	
}
public class Q4 {
	public static Scanner scanner = new Scanner(System.in);
	public static Book input() {
		System.out.println("Enter Book id");
	    String id = scanner.nextLine();
	    System.out.println("Enter Book Title");
	    String bookTitle = scanner.nextLine();
	    System.out.println("Enter Book Author Name");
	    String bookAuthorName = scanner.nextLine();
	    System.out.println("Enter Book price ");
	    float price = scanner.nextFloat();
	    System.out.println("Enter Book quantity ");
	    int quantity = scanner.nextInt();
	    return new Book(id, bookTitle, bookAuthorName, price, quantity);
	}
	public static void main(String[] args) {
		Book book = input();
		System.out.println("Enter quantity to purchase book :- ");
		int quantity = scanner.nextInt();
		book.purchase(quantity);
		
	}
}