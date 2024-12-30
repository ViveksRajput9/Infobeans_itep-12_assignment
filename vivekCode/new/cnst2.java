class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + ":" + name);
    }
    Student(Student x){
        this.id = x.id;
        this.name = x.name;
    }
}
class Const2{
    public static void main(String args []){
        Student s1 = new Student(102, "hello");
        s1.display();
        Student s2 = new Student(s1);
        s2.display();
    }
}