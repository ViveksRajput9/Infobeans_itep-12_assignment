package oops.Super;
class Person {
    int id ;
    String name;
    String email;
    Person(int id , String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    void display(){
        System.out.println(id+" : "+name+" : "+ email);
    }
}
class Employee extends Person{
    int salary;
    String designation;
    Employee(int id , String name, String email,int salary,String designation){
        super(id, name, email);
        this.salary = salary;
        this.designation = designation;
    }
    void display(){
        super.display();
        System.out.println(salary +":"+designation);
    }
}
public class su5 {
    public static void main(String[] args) {
        Employee em1 = new Employee(101, "rashmika", "abc@gmail.com", 900,"Developer");
        em1.display();
    }
}
