class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("para constructer");
    }
    void disply(){
        System.out.println(id + ":" + name);
    }
}
class Beta{
    public static void main(String args[]){
        Student s1 = new Student(12, "weg");
        s1.disply();
        Student s2 = new Student(24, "dsfgs");
        s2.disply();
    }
}