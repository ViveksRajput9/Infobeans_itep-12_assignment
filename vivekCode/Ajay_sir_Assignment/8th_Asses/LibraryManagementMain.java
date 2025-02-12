package vivekCode;

interface LibraryOperation{
	void issueBook();
	void returnBook();
}
class Student implements LibraryOperation
{
	public void issueBook() {
		System.out.println("Book issued");
	}
	public void returnBook() {
		System.out.println("Book retured ");
	}
}
class Teacher implements LibraryOperation 
{
	public void issueBook() {
		System.out.println("Book issued");
	}
	public void returnBook() {
		System.out.println("Book returned");
	}
}
public class LibraryManagementMain {

	public static void main(String[] args) {
		LibraryOperation obj = new Student();
		obj.issueBook();
		obj.returnBook();
		LibraryOperation obj1 = new Teacher();
		obj1.issueBook();
		obj1.returnBook();
	}
}
