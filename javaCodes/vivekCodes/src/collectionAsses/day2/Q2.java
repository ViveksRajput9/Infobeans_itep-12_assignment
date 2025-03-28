package collectionAsses.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class BookManagement{
	private String title ;
	private String author;
	private String ISBN;
	private int price;
	public BookManagement(String title, String author, String iSBN, int price) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookManagement [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
}
public class Q2 {
	static List<BookManagement> l = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
    public static void addNewBook() {
        System.out.print("Title Name: ");
        String title = sc.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("Title cannot be empty.");
            return;
        }

        System.out.print("Author Name: ");
        String authorName = sc.nextLine().trim();
        if (authorName.isEmpty()) {
            System.out.println("Author name cannot be empty.");
            return;
        }

        System.out.print("ISBN: ");
        String iSBN = sc.nextLine().trim();
        if (iSBN.isEmpty()) {
            System.out.println("ISBN cannot be empty.");
            return;
        }

        System.out.print("Enter price: ");
        int price;
        try {
            price = Integer.parseInt(sc.nextLine().trim());
            if (price <= 0) {
                System.out.println("Price must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Please enter a valid number.");
            return;
        }

        l.add(new BookManagement(title, authorName, iSBN, price));
        System.out.println("Book added successfully!");
    }
	public static void displayAllBooks() {
		for(BookManagement b : l) {
			System.out.println(b);
		}
	}
	public static void serchBook(String title) {
		boolean flag = true;
		for (BookManagement bookManagement : l) {
			if(bookManagement.getTitle().equals(title)) {
				flag = false;
				System.out.println(bookManagement);
				break;
			}
		}		if(flag) {
			System.out.println("No Record Found");
		}
	}
	public static void removeBook(String iSBN) {
		boolean flag = true;

		for (BookManagement bookManagement : l) {
			if(bookManagement.getISBN().equals(iSBN)) {
				flag = false;

				l.remove(bookManagement);
			    break;
			}
		}
		if(flag) {
		    System.out.println("No Record Found");
		}
	}
	public static int expensiveBook() {
		int temp=l.get(0).getPrice();
		
		for (int i = 1;i<l.size();i++) {
			if(l.get(i).getPrice()>temp) {
				temp = l.get(i).getPrice();
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		while(true) {
			System.out.println("Do you want to add book");
			System.out.println("type y for Yes and N for No");
			char c = sc.nextLine().charAt(0);
			if(c=='n'||c=='N') {
				break;
			}
			System.out.println();
			addNewBook();
		}
		System.out.println("search book by title :- ");
		String title = sc.nextLine();
		serchBook(title);
//		System.out.println("remove book Enter iSBN :-");
//		String iSBN =sc.nextLine();
//		removeBook(iSBN);
		System.out.println("most Expensive Book is =  "+expensiveBook());
		
	}
}