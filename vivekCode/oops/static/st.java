class Person{
    int id;
    String name;
    static int count;
    Person(){
        count++;
    }
    Person(int id){
        this.id = id;
    }
    Person(int id ,String name){
        this.id = id;
        this.name = name;
    }
}
public class st {
    public static void main(String[] args) {
        
        Person obj = new Person();
        Person obj1 = new Person();
        Person obj2 = new Person(101);
        Person obj3 = new Person(102,"vivek");
        System.out.println(Person.count);
    }

}
