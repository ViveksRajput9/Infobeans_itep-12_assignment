class Employee{
    int employeeId ;
    float salary;
    Employee(int employeeId, float salary){
        this.employeeId = employeeId;
        this.salary = salary;
    }
    void displayDetails(){}

}
class EmployeeLevel extends Employee{
    EmployeeLevel(int employeeId,float salary){
        super(employeeId, salary);
    }
    int getSalaryLevel(){
        if(salary>100){
            return 1;
        }else{
            return 2;
        }
    }
    void displayDetails(){
        System.out.println(" EmployeeId : "+employeeId+" Salary : "+salary+" Level : "+getSalaryLevel());
    }
}
public class SalaryLevelMain {
    public static void main(String[] args) {
        Employee  emp;
        emp = new EmployeeLevel(564654, 50.50f);
        emp.displayDetails();
    }
}
