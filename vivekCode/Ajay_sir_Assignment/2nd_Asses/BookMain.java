
class Book {
    String title;
    String author;
    double price;
    
    Book(String title , String author , double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(Book book){
        this.title = book.title;
        this.author = book.author;
        this.price =  book.price;
    }

    void displayDetail(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        }

    }
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "jam", 25);
        Book book2 = new Book(book1);
        book2.displayDetail();
    }
}
