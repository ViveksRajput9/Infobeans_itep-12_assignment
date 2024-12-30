package oops;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;
    int quantity;
    
    Book(String title , String author , double price,int quantity){
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetail(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Book book = new Book("Harry Potter" , "J.K Rowling" , 200,10);
        // book.displayDetail();
        // Book book1 = new Book("The Lord of the Rings" , "J.R.R Tolkien" , 500,25);
        // book1.displayDetail();

        Book booklist[] = new Book[2];
        for(int i =0;i<booklist.length;i++){
            System.out.println(" Enter "+i+" the details of the book ");
            System.out.print("Enter the title of the book : ");
            String title = sc.nextLine();
            System.out.print("Enter the author of the book : ");
            String author = sc.nextLine();
            System.out.print("Enter the price of the book : ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Enter the quantity of the book : ");  
            int quantity = Integer.parseInt(sc.nextLine());
            booklist[i] = new Book(title,author,price,quantity); 
        }
        for (Book book2 : booklist) {
            book2.displayDetail();
        }
        sc.close();

        // for(Book i:booklist){
        //     i.displayDetail();
        
        // }
    }
}