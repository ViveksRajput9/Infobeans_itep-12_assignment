class A{
    int a ;
}
class B extends A{
    int a , c;
    void set(int x , int y){
        super.a=x;
        a=y;
    }
    void add(){
        c=super.a+a;
    }
    void display(){
        System.out.println(c);
    }
}
public class su1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.set(100, 200);
        obj.add();
        obj.display();
    }
}