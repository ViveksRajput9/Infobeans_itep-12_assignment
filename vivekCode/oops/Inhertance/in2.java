package oops.Inhertance;
class Human 
{
    private String name;
    int age;
    Human ()
    {
        System.out.println("Human class Constructor ");
    }
    static 
    {
        System.out.println("Human class Static method");
    }
    void sleep()
    {

        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);

    }
}
class Student1 extends Human
{
    static
    {
        System.out.println("This is a Student1  class static method");
    }
    {
        System.out.println("this is Student 1 class block");
    }
    Student1()
    {
        System.out.println("this is a Student1 Constructor ");
    }
    {
        System.out.println("this is Student1 class second block");
    }
}
class Student extends Student1 
{

    Student()
    {
        System.out.println("this is a Student class constructor");
    }
    static
    {
        System.out.println("Student class Static methods");
    }
    void disp()
    {
        System.out.println("the age is : "+age);
    }

}
public class in2 {
    public static void main(String[] args) {
        
        Student st = new Student();
        st.sleep();
    }
}