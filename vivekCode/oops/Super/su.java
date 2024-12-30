package oops.Super;
class A{
    int a ;
}
class B extends A{
    int a , c;
    void set(int x , int y){
        a=x;
        a=y;
    }
    void add(){
        c=a+a;
    }
    void display(){
        System.out.println(c);
    }
}
public class su {
    public static void main(String[] args) {
        B obj = new B();
        obj.set(100, 200);
        obj.add();
        obj.display();
    }
}
