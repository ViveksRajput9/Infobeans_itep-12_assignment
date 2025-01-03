
import java.util.Scanner;

/*1.
You are tasked with developing a Java program to manage employee records. The program should allow users to input the first name, last name, employee ID, and job title of an employee. Once the user inputs these details, the program should display the employee's information, including their full name, employee ID, and job title.

Requirements:

Create a class Person with the following attributes:
•	firstName - String
•	lastName - String

This class serves as a base class for other classes and will be extended by the 'Employee' class.

Create a class 'Employee' that extends the 'Person' class:

•	Inherits attributes firstName and lastName from Person.
•	Has additional attributes:
1.	employeeId - int
2.	jobTitle - String
•	Implement getters, setters, and constructors for all the above-mentioned attributes in both Person and Employee classes.

Create a class named 'Main' which contains the main method where program execution begins:

•	It prompts the user to input the details of an employee.
•	It creates an Employee object with the provided details.
•	It displays the employee's information using the getters implemented in the 'Employee' class.
Input format :
•	The first line consists of a String that represents firstName.
•	The second line consists of a String that represents lastName.
•	The third line consists of an int that represents the employeeId.
•	The fourth line consists of a String that represents the jobTitle.
Output format :
•	The output should display the employee details in the following format:
Employee details:
Name: <firstName> <lastName>, <jobTitle>
Employee ID: <employeeId>

Refer to the sample output for formatting specifications.
Sample test cases :
Input 1 :
John
Mathew
120948
Developer
Output 1 :
Employee details:
Name: John Mathew, Developer
Employee ID: 120948
Input 2 :
Tony
Stark
98364
Senior Program Manager
Output 2 :
Employee details:
Name: Tony Stark, Senior Program Manager
Employee ID: 9836?*/
class Person {
    private String firstName;
    private String lastName;

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getJobTitle() {
        return jobTitle;
    }

    void displayEmployeeDetail() {
        System.out.println("Employee details:");
        System.out.println("Name: " + getFirstName() + " " + getLastName() + ", " + getJobTitle());
        System.out.println("Employee ID: " + getEmployeeId());
        
    }
}
public class EmployeeRecordMain {
    public static void inputData(Employee emp) {
        int flag = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the details of the employee");
            System.out.println("You can enter the details only two times");
    
            if (flag != 2) {
                System.out.println("Enter the first name");
                emp.setFirstName(sc.nextLine());
                System.out.println("Enter the last name");
                emp.setLastName(sc.nextLine());
                System.out.println("Enter the employeeId");
                emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
                System.out.println("Enter the jobTitle");
                emp.setJobTitle(sc.nextLine());
                flag++;
            } else {
                System.out.println("Sorry you reched the limit");
            }
    
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        inputData(emp);
        System.out.println();
        emp.displayEmployeeDetail();
    }
    
}
