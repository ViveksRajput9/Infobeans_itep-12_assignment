package vivekCode.oops.Inhertance;

class LibraryItem {
    protected String title;
    protected String author;
    protected int yearPublished;

    public LibraryItem(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}

class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int yearPublished, String genre) {
        super(title, author, yearPublished);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends LibraryItem {
    private int volume;

    public Magazine(String title, String author, int yearPublished, int volume) {
        super(title, author, yearPublished);
        this.volume = volume;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Volume: " + volume);
    }
}

class DVD extends LibraryItem {
    private int runtime;

    public DVD(String title, String author, int yearPublished, int runtime) {
        super(title, author, yearPublished);
        this.runtime = runtime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Runtime: " + runtime + " minutes");
    }
}

public class heri {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Novel");
        Magazine magazine = new Magazine("National Geographic", "Various", 2021, 12);
        DVD dvd = new DVD("Inception", "Christopher Nolan", 2010, 148);

        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}
