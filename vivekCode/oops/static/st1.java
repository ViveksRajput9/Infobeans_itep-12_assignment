class Person{

    {
        System.out.println("instance block1");
    }
    static 
    {
       System.out.println("static initialization block1");
    }
    Person()
    {
        this(10);
        System.out.println("person default constructor");
    }
    Person(int x)
    {
        this(10, 20);
       System.out.println("person single constructor");
    }
    Person(int x , int y)
    {
        System.out.println(" person double constructor");
    }
}
class Employee extends Person{
    {
        System.out.println("instance block Employee");
    }
    static 
    {
        System.out.println("static initialization block Employee");
    }
    Employee()
    { 
        this(10);
        System.out.println(" employee default constructor ");
    }
    Employee(int x)
    {
        super(10);
        System.out.println(" employee single constructor ");

    }

}

class st1{
    public static void main(String ar[]){
        System.out.println(" main start ");
        Employee em = new Employee();
        st1 obj1 = new st1();
    }
    static 
    {
        System.out.println("  main static ");
    }
    {
        System.out.println(" instance beta ");
    }
}